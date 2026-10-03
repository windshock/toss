package viva.republica.toss.plcc.view.showcase;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener2;
import android.hardware.SensorManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.CarouselKtCarousel4ExternalSyntheticLambda0;
import o.CarouselKtExternalSyntheticLambda7;
import o.CarouselKtExternalSyntheticLambda8;
import o.CarouselPagerStateExternalSyntheticLambda1;
import o.RecomposerawaitIdle2;
import o.ReusableRememberObserverHolder;
import o.SecureTextFieldControllerExternalSyntheticLambda0;
import o.generateLink;
import o.isOneShot;
import o.noStore;
import o.toCircle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PlccShowcaseView extends ConstraintLayout implements SensorEventListener2 {
    private boolean IAuthTabCallback;
    private AnimatorSet IAuthTabCallbackDefault;
    private float[] IAuthTabCallbackStub;
    private SensorManager IAuthTabCallbackStubProxy;
    private float IAuthTabCallback_Parcel;
    private PlccShowcaseShadowView access000;
    private float access100;
    private float asBinder;
    private boolean asInterface;
    private float[] extraCallback;
    private Float getInterfaceDescriptor;
    private PlccShowcaseCardView onExtraCallbackWithResult;
    private toCircle.IAuthTabCallback onNavigationEvent;
    private float[] onTransact;
    private float[] writeTypedObject;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onWarmupCompleted = 8;
    private static final SecureTextFieldControllerExternalSyntheticLambda0 onExtraCallback = new SecureTextFieldControllerExternalSyntheticLambda0();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(@Nullable Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener2
    public void onFlushCompleted(@Nullable Sensor sensor) {
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlccShowcaseView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback = true;
        onWarmupCompleted(this, null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlccShowcaseView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback = true;
        onWarmupCompleted(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlccShowcaseView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback = true;
        onWarmupCompleted(attributeSet);
    }

    static /* synthetic */ void onWarmupCompleted(PlccShowcaseView plccShowcaseView, AttributeSet attributeSet, int i, Object obj) {
        if ((i & 1) != 0) {
            attributeSet = null;
        }
        plccShowcaseView.onWarmupCompleted(attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(AttributeSet attributeSet) {
        setClipToPadding(false);
        setClipChildren(false);
        onNavigationEvent();
        this.extraCallback = new float[10];
        this.writeTypedObject = new float[10];
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.PlccShowcaseView, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            float dimensionPixelSize = getResources().getDisplayMetrics().density * 16.0f;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == R.styleable.PlccShowcaseView_dropShadow) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == R.styleable.PlccShowcaseView_dropShadowDistance) {
                    dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) dimensionPixelSize);
                }
            }
            this.IAuthTabCallback = z;
            this.asBinder = dimensionPixelSize;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        Object systemService = getContext().getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "");
        SensorManager sensorManager = (SensorManager) systemService;
        this.IAuthTabCallbackStubProxy = sensorManager;
        SensorManager sensorManager2 = null;
        if (sensorManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            sensorManager = null;
        }
        SensorManager sensorManager3 = this.IAuthTabCallbackStubProxy;
        if (sensorManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            sensorManager3 = null;
        }
        sensorManager.registerListener(this, sensorManager3.getDefaultSensor(1), 1);
        SensorManager sensorManager4 = this.IAuthTabCallbackStubProxy;
        if (sensorManager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            sensorManager4 = null;
        }
        SensorManager sensorManager5 = this.IAuthTabCallbackStubProxy;
        if (sensorManager5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            sensorManager2 = sensorManager5;
        }
        sensorManager4.registerListener(this, sensorManager2.getDefaultSensor(2), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent() {
        PlccShowcaseCardView plccShowcaseCardView = new PlccShowcaseCardView(getContext());
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = new ConstraintLayout.onExtraCallbackWithResult(0, 0);
        onextracallbackwithresult.IPostMessageServiceStubProxy = 0;
        onextracallbackwithresult.setEngagementSignalsCallback = 0;
        onextracallbackwithresult.IEngagementSignalsCallbackStubProxy = 0;
        onextracallbackwithresult.IAuthTabCallback = 0;
        plccShowcaseCardView.setLayoutParams(onextracallbackwithresult);
        this.onExtraCallbackWithResult = plccShowcaseCardView;
        PlccShowcaseShadowView plccShowcaseShadowView = new PlccShowcaseShadowView(getContext());
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult2 = new ConstraintLayout.onExtraCallbackWithResult(0, 0);
        onextracallbackwithresult2.IPostMessageServiceStubProxy = 0;
        onextracallbackwithresult2.setEngagementSignalsCallback = 0;
        onextracallbackwithresult2.IEngagementSignalsCallbackStubProxy = 0;
        onextracallbackwithresult2.IAuthTabCallback = 0;
        plccShowcaseShadowView.setLayoutParams(onextracallbackwithresult2);
        this.access000 = plccShowcaseShadowView;
        addView(plccShowcaseShadowView);
        PlccShowcaseCardView plccShowcaseCardView2 = this.onExtraCallbackWithResult;
        if (plccShowcaseCardView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            plccShowcaseCardView2 = null;
        }
        addView(plccShowcaseCardView2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super/*android.view.View*/.onTouchEvent(motionEvent);
                    }
                }
            }
            onWarmupCompleted();
            return true;
        }
        if (!this.asInterface) {
            onExtraCallbackWithResult();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult() {
        this.asInterface = true;
        final float f = this.access100;
        final float f2 = this.IAuthTabCallback_Parcel;
        AnimatorSet animatorSet = this.IAuthTabCallbackDefault;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getScaleX(), 0.95f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.plcc.view.showcase.PlccShowcaseView$$ExternalSyntheticLambda4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PlccShowcaseView.IAuthTabCallback(this.f$0, valueAnimatorOfFloat, valueAnimator);
            }
        });
        final ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.plcc.view.showcase.PlccShowcaseView$$ExternalSyntheticLambda5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PlccShowcaseView.onExtraCallbackWithResult(valueAnimatorOfFloat2, this, f, f2, valueAnimator);
            }
        });
        animatorSet2.setDuration(100L);
        animatorSet2.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet2.start();
        this.IAuthTabCallbackDefault = animatorSet2;
        isOneShot.onExtraCallbackWithResult(this, noStore.Companion.asBinder());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void IAuthTabCallback(PlccShowcaseView plccShowcaseView, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        Intrinsics.checkNotNullParameter(valueAnimator2, "");
        plccShowcaseView.setPivotX(plccShowcaseView.getMeasuredWidth() / 2.0f);
        plccShowcaseView.setPivotY(plccShowcaseView.getMeasuredHeight() / 2.0f);
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        plccShowcaseView.setScaleX(fFloatValue);
        plccShowcaseView.setScaleY(fFloatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(ValueAnimator valueAnimator, PlccShowcaseView plccShowcaseView, float f, float f2, ValueAnimator valueAnimator2) {
        Intrinsics.checkNotNullParameter(valueAnimator2, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        plccShowcaseView.onNavigationEvent(f * fFloatValue, fFloatValue * f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted() {
        this.asInterface = false;
        AnimatorSet animatorSet = this.IAuthTabCallbackDefault;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getScaleX(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.plcc.view.showcase.PlccShowcaseView$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PlccShowcaseView.onExtraCallback(this.f$0, valueAnimatorOfFloat, valueAnimator);
            }
        });
        final ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.plcc.view.showcase.PlccShowcaseView$$ExternalSyntheticLambda3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PlccShowcaseView.IAuthTabCallback(valueAnimatorOfFloat2, this, valueAnimator);
            }
        });
        animatorSet2.setDuration(100L);
        animatorSet2.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet2.start();
        this.IAuthTabCallbackDefault = animatorSet2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onExtraCallback(PlccShowcaseView plccShowcaseView, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        Intrinsics.checkNotNullParameter(valueAnimator2, "");
        plccShowcaseView.setPivotX(plccShowcaseView.getMeasuredWidth() / 2.0f);
        plccShowcaseView.setPivotY(plccShowcaseView.getMeasuredHeight() / 2.0f);
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        plccShowcaseView.setScaleX(fFloatValue);
        plccShowcaseView.setScaleY(fFloatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(ValueAnimator valueAnimator, PlccShowcaseView plccShowcaseView, ValueAnimator valueAnimator2) {
        Intrinsics.checkNotNullParameter(valueAnimator2, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        plccShowcaseView.onNavigationEvent(plccShowcaseView.access100 * fFloatValue, fFloatValue * plccShowcaseView.IAuthTabCallback_Parcel);
    }

    private final float onWarmupCompleted(float f, float[] fArr) {
        double dRint = Math.rint(Math.toDegrees(f));
        IntIterator it = RangesKt.until(1, 10).iterator();
        float f2 = 0.0f;
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            fArr[iNextInt - 1] = fArr[iNextInt];
            f2 += fArr[iNextInt];
        }
        fArr[9] = (float) dRint;
        return (float) ((f2 + dRint) / 10.0d);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@NotNull SensorEvent sensorEvent) {
        float[] fArr;
        float fFloatValue;
        Intrinsics.checkNotNullParameter(sensorEvent, "");
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            this.IAuthTabCallbackStub = sensorEvent.values;
        } else if (type != 2) {
            return;
        } else {
            this.onTransact = sensorEvent.values;
        }
        float[] fArr2 = this.IAuthTabCallbackStub;
        if (fArr2 == null || (fArr = this.onTransact) == null) {
            return;
        }
        float[] fArr3 = new float[9];
        float[] fArr4 = null;
        if (SensorManager.getRotationMatrix(fArr3, null, fArr2, fArr)) {
            float[] fArr5 = new float[9];
            SensorManager.getOrientation(fArr3, fArr5);
            float f = fArr5[1];
            Float f2 = this.getInterfaceDescriptor;
            if (f2 != null) {
                fFloatValue = f2.floatValue();
            } else {
                this.getInterfaceDescriptor = Float.valueOf(f);
                Unit unit = Unit.INSTANCE;
                fFloatValue = f;
            }
            if (this.asInterface) {
                return;
            }
            float f3 = fArr5[2];
            float[] fArr6 = this.writeTypedObject;
            if (fArr6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fArr6 = null;
            }
            float fOnWarmupCompleted = onWarmupCompleted(f3 * 0.3f, fArr6);
            float[] fArr7 = this.extraCallback;
            if (fArr7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fArr4 = fArr7;
            }
            this.access100 = Math.min(15.0f, Math.max(-15.0f, -onWarmupCompleted((f - fFloatValue) * 0.3f, fArr4)));
            float fMin = Math.min(15.0f, Math.max(-15.0f, -fOnWarmupCompleted));
            this.IAuthTabCallback_Parcel = fMin;
            onNavigationEvent(this.access100, fMin);
        }
    }

    private final void onNavigationEvent(float f, float f2) {
        PlccShowcaseShadowView plccShowcaseShadowView = this.access000;
        PlccShowcaseCardView plccShowcaseCardView = null;
        if (plccShowcaseShadowView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            plccShowcaseShadowView = null;
        }
        if (this.IAuthTabCallback) {
            plccShowcaseShadowView.setRotationX(f);
            plccShowcaseShadowView.setRotationY(f2);
            float f3 = this.asBinder;
            PlccShowcaseCardView plccShowcaseCardView2 = this.onExtraCallbackWithResult;
            if (plccShowcaseCardView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                plccShowcaseCardView2 = null;
            }
            float translationY = (plccShowcaseCardView2.getTranslationY() / f3) / 2.0f;
            plccShowcaseShadowView.setTranslationX(((-f2) * f3) / 15.0f);
            plccShowcaseShadowView.setTranslationY(f3 * ((f / 15.0f) + ((1.0f - translationY) * 0.75f)));
            plccShowcaseShadowView.setVisibility(0);
        } else {
            plccShowcaseShadowView.setVisibility(4);
        }
        PlccShowcaseCardView plccShowcaseCardView3 = this.onExtraCallbackWithResult;
        if (plccShowcaseCardView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            plccShowcaseCardView = plccShowcaseCardView3;
        }
        plccShowcaseCardView.setRotationX(f);
        plccShowcaseCardView.setRotationY(f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCardStyle(@NotNull toCircle.IAuthTabCallback iAuthTabCallback, boolean z) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        final boolean z2 = iAuthTabCallback != this.onNavigationEvent;
        this.onNavigationEvent = iAuthTabCallback;
        PlccShowcaseShadowView plccShowcaseShadowView = this.access000;
        PlccShowcaseCardView plccShowcaseCardView = null;
        if (plccShowcaseShadowView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            plccShowcaseShadowView = null;
        }
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        onExtraCallback(plccShowcaseShadowView, iAuthTabCallback.getShadowImageUrl(generateLink.IAuthTabCallback(resources)), (Function1<? super Bitmap, Unit>) new Function1() { // from class: viva.republica.toss.plcc.view.showcase.PlccShowcaseView$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return PlccShowcaseView.onNavigationEvent(this.f$0, (Bitmap) obj);
            }
        });
        PlccShowcaseShadowView plccShowcaseShadowView2 = this.access000;
        if (plccShowcaseShadowView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            plccShowcaseShadowView2 = null;
        }
        plccShowcaseShadowView2.setVisibility(4);
        PlccShowcaseCardView plccShowcaseCardView2 = this.onExtraCallbackWithResult;
        if (plccShowcaseCardView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            plccShowcaseCardView = plccShowcaseCardView2;
        }
        onExtraCallback(plccShowcaseCardView, iAuthTabCallback.getCardImageUrl(z), (Function1<? super Bitmap, Unit>) new Function1() { // from class: viva.republica.toss.plcc.view.showcase.PlccShowcaseView$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return PlccShowcaseView.IAuthTabCallback(this.f$0, z2, (Bitmap) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(PlccShowcaseView plccShowcaseView, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        PlccShowcaseShadowView plccShowcaseShadowView = plccShowcaseView.access000;
        if (plccShowcaseShadowView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            plccShowcaseShadowView = null;
        }
        plccShowcaseShadowView.setShadowImage(bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(PlccShowcaseView plccShowcaseView, boolean z, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        PlccShowcaseCardView plccShowcaseCardView = plccShowcaseView.onExtraCallbackWithResult;
        PlccShowcaseShadowView plccShowcaseShadowView = null;
        if (plccShowcaseCardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            plccShowcaseCardView = null;
        }
        plccShowcaseCardView.setCardBitmap(bitmap);
        if (plccShowcaseView.IAuthTabCallback) {
            PlccShowcaseShadowView plccShowcaseShadowView2 = plccShowcaseView.access000;
            if (plccShowcaseShadowView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                plccShowcaseShadowView = plccShowcaseShadowView2;
            }
            plccShowcaseShadowView.setVisibility(0);
        }
        if (z) {
            plccShowcaseView.onExtraCallback();
        }
        return Unit.INSTANCE;
    }

    private final void onExtraCallback() {
        if (this.IAuthTabCallback) {
            float f = this.asBinder / 2.0f;
            PlccShowcaseCardView plccShowcaseCardView = this.onExtraCallbackWithResult;
            if (plccShowcaseCardView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                plccShowcaseCardView = null;
            }
            plccShowcaseCardView.setTranslationY(f);
            plccShowcaseCardView.animate().translationY(0.0f).setDuration(800L).setInterpolator(onExtraCallback).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.plcc.view.showcase.PlccShowcaseView$$ExternalSyntheticLambda6
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PlccShowcaseView.IAuthTabCallback(this.f$0, valueAnimator);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(PlccShowcaseView plccShowcaseView, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        PlccShowcaseShadowView plccShowcaseShadowView = plccShowcaseView.access000;
        if (plccShowcaseShadowView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            plccShowcaseShadowView = null;
        }
        plccShowcaseShadowView.setAlpha(valueAnimator.getAnimatedFraction());
        plccShowcaseView.onNavigationEvent(plccShowcaseView.access100, plccShowcaseView.IAuthTabCallback_Parcel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        SensorManager sensorManager = this.IAuthTabCallbackStubProxy;
        if (sensorManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            sensorManager = null;
        }
        sensorManager.unregisterListener(this);
    }

    public static final class onNavigationEvent implements ReusableRememberObserverHolder {
        final /* synthetic */ View IAuthTabCallback;
        final /* synthetic */ Function1<Bitmap, Unit> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        onNavigationEvent(View view, Function1<? super Bitmap, Unit> function1) {
            this.IAuthTabCallback = view;
            this.onWarmupCompleted = function1;
        }

        public /* bridge */ void onWarmupCompleted(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            super.onWarmupCompleted(carouselKtExternalSyntheticLambda7);
        }

        public void IAuthTabCallback(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            if (Intrinsics.areEqual(this.IAuthTabCallback.getTag(), this)) {
                this.IAuthTabCallback.setTag(null);
            }
        }

        public void onExtraCallbackWithResult(CarouselKtExternalSyntheticLambda7 carouselKtExternalSyntheticLambda7) {
            Intrinsics.checkNotNullParameter(carouselKtExternalSyntheticLambda7, "");
            this.onWarmupCompleted.invoke(CarouselPagerStateExternalSyntheticLambda1.onExtraCallbackWithResult(carouselKtExternalSyntheticLambda7, 0, 0, 3, (Object) null));
            if (Intrinsics.areEqual(this.IAuthTabCallback.getTag(), this)) {
                this.IAuthTabCallback.setTag(null);
            }
        }
    }

    private final void onExtraCallback(View view, String str, Function1<? super Bitmap, Unit> function1) {
        onNavigationEvent onnavigationevent = new onNavigationEvent(view, function1);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(context);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult.onWarmupCompleted(new RecomposerawaitIdle2.onNavigationEvent(context2).onExtraCallback(str).IAuthTabCallback(onnavigationevent).onExtraCallbackWithResult());
        view.setTag(onnavigationevent);
    }
}
