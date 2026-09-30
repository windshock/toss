package im.toss.tds.view.component.atom.checkbox;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.tds.view.R;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography5;
import kotlin.Deprecated;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ComposableLambdaImplExternalSyntheticLambda2;
import o.ComposableLambdaImplExternalSyntheticLambda9;
import o.ComposableLambdaNImplExternalSyntheticLambda0;
import o.ManagedRetainedValuesStoreKtExternalSyntheticLambda0;
import o.access15300;
import o.getUrlokhttp;
import o.response;
import o.setBodyokhttp;
import o.setPingIntervalokhttp;
import o.setProxySelectorokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TdsCheckBoxV1View extends ConstraintLayout implements Checkable {
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int asInterface = 0;
    private static int onTransact = 1;
    private boolean IAuthTabCallback;
    private onExtraCallbackWithResult IAuthTabCallbackStub;
    private onNavigationEvent asBinder;
    private final BaseTextView onExtraCallback;
    private final LottieAnimationView onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private boolean onWarmupCompleted;

    public interface onExtraCallbackWithResult {
        void onNavigationEvent(@NotNull TdsCheckBoxV1View tdsCheckBoxV1View, boolean z);
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        int i = IAuthTabCallbackDefault + 57;
        IAuthTabCallbackStubProxy = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsCheckBoxV1View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsCheckBoxV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void IAuthTabCallback(TdsCheckBoxV1View tdsCheckBoxV1View) {
        int i = 2 % 2;
        int i2 = asInterface + 17;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(tdsCheckBoxV1View);
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        int i5 = onTransact + 113;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void onWarmupCompleted(TdsCheckBoxV1View tdsCheckBoxV1View, View view) {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(tdsCheckBoxV1View, view);
        int i4 = onTransact + 77;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.view.View, android.widget.TextView, im.toss.tds.view.component.atom.text.BaseTextView, java.lang.Object] */
    public TdsCheckBoxV1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        String str;
        boolean z;
        onNavigationEvent onnavigationevent;
        int i2;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.asBinder = onNavigationEvent.CIRCLE_BIG_PRIMARY;
        this.onWarmupCompleted = true;
        this.onNavigationEvent = true;
        int iGenerateViewId = View.generateViewId();
        int iGenerateViewId2 = View.generateViewId();
        LottieAnimationView lottieAnimationView = new LottieAnimationView(getContext());
        lottieAnimationView.setId(iGenerateViewId);
        Class cls = Integer.TYPE;
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = (ViewGroup.LayoutParams) ConstraintLayout.onExtraCallbackWithResult.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(onextracallbackwithresult);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).width = -2;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).height = -2;
        onextracallbackwithresult2.IPostMessageServiceStubProxy = 0;
        onextracallbackwithresult2.IAuthTabCallback = 0;
        onextracallbackwithresult2.ITrustedWebActivityCallback = 0;
        onextracallbackwithresult2.extraCallback = iGenerateViewId2;
        onextracallbackwithresult2.ICustomTabsService = 2;
        lottieAnimationView.setLayoutParams(onextracallbackwithresult);
        setPingIntervalokhttp.onWarmupCompleted(lottieAnimationView);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, lottieAnimationView);
        this.onExtraCallbackWithResult = lottieAnimationView;
        ?? r3 = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(getContext());
        Intrinsics.checkNotNull((Object) r3);
        r3.setId(iGenerateViewId2);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult3 = (ViewGroup.LayoutParams) ConstraintLayout.onExtraCallbackWithResult.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(onextracallbackwithresult3);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult4 = onextracallbackwithresult3;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult4).width = -2;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult4).height = -2;
        onextracallbackwithresult4.IPostMessageServiceStubProxy = iGenerateViewId;
        onextracallbackwithresult4.IAuthTabCallback = iGenerateViewId;
        onextracallbackwithresult4.IPostMessageServiceDefault = iGenerateViewId;
        onextracallbackwithresult4.ICustomTabsCallback = 0;
        onextracallbackwithresult4.access000 = true;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        onextracallbackwithresult4.setMarginStart(varyMatches.onNavigationEvent(Float.valueOf(12.0f), displayMetrics));
        r3.setLayoutParams(onextracallbackwithresult3);
        r3.setMaxLines(1);
        r3.setEllipsize(TextUtils.TruncateAt.END);
        Context context2 = r3.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        r3.setTextColor(new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration)).onRelationshipValidationResult());
        r3.onNavigationEvent(response.Medium);
        Intrinsics.checkNotNull((Object) r3);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, (View) r3);
        this.onExtraCallback = r3;
        setClipToPadding(false);
        setClipChildren(false);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsCheckBoxV1, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            str = "";
            z = false;
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == R.styleable.TdsCheckBoxV1_checkBoxSize) {
                    this.asBinder = onNavigationEvent.Companion.IAuthTabCallback((onExtraCallback) onExtraCallback.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0)));
                } else if (index == R.styleable.TdsCheckBoxV1_checkBoxType) {
                    int i4 = onTransact + 55;
                    asInterface = i4 % 128;
                    int i5 = i4 % 2;
                    this.asBinder = (onNavigationEvent) onNavigationEvent.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, this.asBinder.ordinal()));
                } else {
                    if (index == R.styleable.TdsCheckBoxV1_android_checked) {
                        int i6 = onTransact + 89;
                        asInterface = i6 % 128;
                        int i7 = i6 % 2;
                        z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                        i2 = asInterface + 117;
                        onTransact = i2 % 128;
                    } else if (index == R.styleable.TdsCheckBoxV1_checkBoxLabel) {
                        int i8 = asInterface + 11;
                        onTransact = i8 % 128;
                        if (i8 % 2 == 0) {
                            typedArrayObtainStyledAttributes.getString(index);
                            throw null;
                        }
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        if (string == null) {
                            i2 = onTransact + 89;
                            asInterface = i2 % 128;
                        } else {
                            str = string;
                        }
                    } else {
                        continue;
                    }
                    int i9 = i2 % 2;
                    int i10 = 2 % 2;
                }
            }
        } else {
            int i11 = asInterface + 117;
            onTransact = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
            str = "";
            z = false;
        }
        onNavigationEvent onnavigationevent2 = this.asBinder;
        if (onnavigationevent2 == onNavigationEvent.CIRCLE_BIG_PRIMARY || onnavigationevent2 == (onnavigationevent = onNavigationEvent.CIRCLE_SMALL_SECONDARY) || onnavigationevent2 == onNavigationEvent.CIRCLE_SMALL_PRIMARY || onnavigationevent2 == onnavigationevent) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(0.5f), displayMetrics2);
            setPadding(getPaddingLeft() + iOnNavigationEvent, getPaddingTop() + iOnNavigationEvent, 0, 0);
        }
        if (!isInEditMode()) {
            this.asBinder.load(context);
            int i14 = 2 % 2;
        }
        onExtraCallbackWithResult(z);
        IAuthTabCallback(!z);
        setLabel(str);
        setChecked(z);
        setOnClickListener(new View.OnClickListener() { // from class: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View$$ExternalSyntheticLambda1
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = 2 % 2;
                int i16 = onNavigationEvent + 109;
                onWarmupCompleted = i16 % 128;
                int i17 = i16 % 2;
                TdsCheckBoxV1View.onWarmupCompleted(this.f$0, view);
                if (i17 != 0) {
                    int i18 = 27 / 0;
                }
            }
        });
        int i15 = onTransact + 121;
        asInterface = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsCheckBoxV1View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onTransact;
            int i4 = i3 + 25;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 39 / 0;
            }
            int i6 = i3 + 27;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i9 = onTransact + 25;
            asInterface = i9 % 128;
            i = i9 % 2 != 0 ? 1 : 0;
        }
        this(context, attributeSet, i);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        int i3 = i2 % 128;
        asInterface = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.IAuthTabCallback;
        int i4 = i3 + 93;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.IAuthTabCallback;
        if (i3 != 0) {
            z = !z;
        }
        setChecked(z);
    }

    private static final void onExtraCallbackWithResult(TdsCheckBoxV1View tdsCheckBoxV1View) {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        tdsCheckBoxV1View.onExtraCallbackWithResult.playAnimation();
        int i4 = onTransact + 67;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        int i = 2 % 2;
        float f = 1.0f;
        if (this.IAuthTabCallback == z) {
            ComposableLambdaNImplExternalSyntheticLambda0 drawable = this.onExtraCallbackWithResult.getDrawable();
            Object obj = null;
            ComposableLambdaNImplExternalSyntheticLambda0 composableLambdaNImplExternalSyntheticLambda0 = drawable instanceof ComposableLambdaNImplExternalSyntheticLambda0 ? drawable : null;
            if (composableLambdaNImplExternalSyntheticLambda0 == null || composableLambdaNImplExternalSyntheticLambda0.onMessageChannelReady()) {
                return;
            }
            int i2 = onTransact + 51;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (z && composableLambdaNImplExternalSyntheticLambda0.extraCallbackWithResult() < 1.0f) {
                this.onExtraCallbackWithResult.setProgress(1.0f);
                return;
            } else {
                if ((!z) && composableLambdaNImplExternalSyntheticLambda0.extraCallbackWithResult() > 0.0f) {
                    this.onExtraCallbackWithResult.setProgress(0.0f);
                    return;
                }
                return;
            }
        }
        onExtraCallbackWithResult(z);
        if (!this.onNavigationEvent) {
            LottieAnimationView lottieAnimationView = this.onExtraCallbackWithResult;
            if (z) {
                int i3 = asInterface + 103;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
            } else {
                f = 0.0f;
            }
            lottieAnimationView.setProgress(f);
        } else if (isAttachedToWindow()) {
            this.onExtraCallbackWithResult.post(new Runnable() { // from class: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // java.lang.Runnable
                public final void run() {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallbackWithResult + 39;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    TdsCheckBoxV1View.IAuthTabCallback(this.f$0);
                    if (i7 != 0) {
                        int i8 = 29 / 0;
                    }
                }
            });
            int i5 = asInterface + 87;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        } else {
            IAuthTabCallback(!z);
        }
        this.IAuthTabCallback = z;
        if (this.onWarmupCompleted) {
            int i7 = asInterface + 67;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = this.IAuthTabCallbackStub;
            if (onextracallbackwithresult != null) {
                onextracallbackwithresult.onNavigationEvent(this, z);
                int i9 = onTransact + 109;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        sendAccessibilityEvent(2048);
    }

    public final void setCheckedState(boolean z) {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            this.onWarmupCompleted = false;
            setChecked(z);
            this.onWarmupCompleted = false;
        } else {
            this.onWarmupCompleted = false;
            setChecked(z);
            this.onWarmupCompleted = true;
        }
        int i3 = onTransact + 105;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setAnimationEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent = z;
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
    }

    private static final void IAuthTabCallback(TdsCheckBoxV1View tdsCheckBoxV1View, View view) {
        int i = 2 % 2;
        int i2 = asInterface + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        tdsCheckBoxV1View.setChecked(!tdsCheckBoxV1View.isChecked());
        int i4 = onTransact + 105;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 115;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            this.onExtraCallbackWithResult.measure(View.MeasureSpec.makeMeasureSpec(onNavigationEvent(), 1073741824), View.MeasureSpec.makeMeasureSpec(onExtraCallbackWithResult(), 1073741824));
            super.onMeasure(i, i2);
            int i5 = 25 / 0;
        } else {
            this.onExtraCallbackWithResult.measure(View.MeasureSpec.makeMeasureSpec(onNavigationEvent(), 1073741824), View.MeasureSpec.makeMeasureSpec(onExtraCallbackWithResult(), 1073741824));
            super.onMeasure(i, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private final int onNavigationEvent() throws NoWhenBranchMatchedException {
        float f;
        int i = 2 % 2;
        int i2 = asInterface + 105;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            switch (IAuthTabCallback.IAuthTabCallback[this.asBinder.ordinal()]) {
                case 1:
                case 2:
                    f = 30.0f;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 8:
                    f = 24.0f;
                    break;
                case 7:
                    int i3 = onTransact + 75;
                    asInterface = i3 % 128;
                    int i4 = i3 % 2;
                    f = 18.0f;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            return varyMatches.onNavigationEvent(Float.valueOf(f), displayMetrics);
        }
        int i5 = IAuthTabCallback.IAuthTabCallback[this.asBinder.ordinal()];
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    private final int onExtraCallbackWithResult() throws NoWhenBranchMatchedException {
        float f;
        int i = 2 % 2;
        int i2 = asInterface + 119;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            switch (IAuthTabCallback.IAuthTabCallback[this.asBinder.ordinal()]) {
                case 1:
                case 2:
                    f = 30.0f;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 8:
                    f = 24.0f;
                    break;
                case 7:
                    f = 18.0f;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(f), displayMetrics);
            int i3 = onTransact + 45;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                return iOnNavigationEvent;
            }
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback.IAuthTabCallback[this.asBinder.ordinal()];
        throw null;
    }

    private final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        if (this.asBinder.getComposition() == null) {
            int i2 = onTransact + 73;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.setAnimation(this.asBinder.getPath());
        } else {
            LottieAnimationView lottieAnimationView = this.onExtraCallbackWithResult;
            ComposableLambdaImplExternalSyntheticLambda2 composition = this.asBinder.getComposition();
            Intrinsics.checkNotNull(composition);
            lottieAnimationView.setComposition(composition);
            int i4 = asInterface + 81;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        this.onExtraCallbackWithResult.setRepeatCount(0);
        this.onExtraCallbackWithResult.setMaxFrame(Integer.MAX_VALUE);
        IAuthTabCallback(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 54 / 0;
            if (isInEditMode()) {
                return;
            }
        } else if (isInEditMode()) {
            return;
        }
        if (z) {
            int i4 = asInterface + 71;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            this.onExtraCallbackWithResult.setProgress(0.0f);
            this.onExtraCallbackWithResult.setSpeed(1.0f);
            return;
        }
        this.onExtraCallbackWithResult.setProgress(1.0f);
        this.onExtraCallbackWithResult.setSpeed(-1.0f);
    }

    @Deprecated
    public final void setSize(@NotNull onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        setType(onNavigationEvent.Companion.IAuthTabCallback(onextracallback));
        int i4 = asInterface + 23;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setType(@NotNull onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        this.asBinder = onnavigationevent;
        if (!isInEditMode()) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            onnavigationevent.load(context);
            int i4 = asInterface + 75;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        requestLayout();
        onExtraCallbackWithResult(isChecked());
        IAuthTabCallback(!isChecked());
        int i6 = onTransact + 93;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setLabel(@Nullable CharSequence charSequence) {
        AppCompatTextView appCompatTextView;
        int i;
        int i2 = 2 % 2;
        if (charSequence != null) {
            int i3 = asInterface + 15;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if (charSequence.length() != 0) {
                int i5 = asInterface + 85;
                onTransact = i5 % 128;
                if (i5 % 2 == 0) {
                    this.onExtraCallback.setText(charSequence);
                    appCompatTextView = this.onExtraCallback;
                    i = 1;
                } else {
                    this.onExtraCallback.setText(charSequence);
                    appCompatTextView = this.onExtraCallback;
                    i = 0;
                }
                appCompatTextView.setVisibility(i);
                return;
            }
        }
        this.onExtraCallback.setVisibility(8);
    }

    public static final class asInterface implements onExtraCallbackWithResult {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function2<TdsCheckBoxV1View, Boolean, Unit> onExtraCallback;

        /* JADX WARN: Multi-variable type inference failed */
        asInterface(Function2<? super TdsCheckBoxV1View, ? super Boolean, Unit> function2) {
            this.onExtraCallback = function2;
        }

        @Override // im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View.onExtraCallbackWithResult
        public void onNavigationEvent(TdsCheckBoxV1View tdsCheckBoxV1View, boolean z) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 3;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(tdsCheckBoxV1View, "");
            this.onExtraCallback.invoke(tdsCheckBoxV1View, Boolean.valueOf(z));
            int i4 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 48 / 0;
            }
        }
    }

    public final void setOnCheckedChangeListener(@NotNull Function2<? super TdsCheckBoxV1View, ? super Boolean, Unit> function2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        setOnCheckedChangeListener(new asInterface(function2));
        int i2 = onTransact + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void setOnCheckedChangeListener(@Nullable onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallbackStub = onextracallbackwithresult;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 113;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityEvent(@NotNull AccessibilityEvent accessibilityEvent) {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(accessibilityEvent, "");
        super/*android.view.View*/.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setChecked(isChecked());
        int i4 = asInterface + 71;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityNodeInfo(@NotNull AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        int i = 2 % 2;
        int i2 = onTransact + 85;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
            super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            z = false;
        } else {
            Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
            super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            z = true;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setChecked(isChecked());
        int i3 = onTransact + 17;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    public CharSequence getAccessibilityClassName() {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return "android.widget.CheckBox";
        }
        throw null;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Deprecated
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onWarmupCompleted;
        public static final onExtraCallback BIG = new onExtraCallback("BIG", 0);
        public static final onExtraCallback MEDIUM = new onExtraCallback("MEDIUM", 1);
        public static final onExtraCallback SMALL = new onExtraCallback("SMALL", 2);
        public static final onExtraCallback SELECT = new onExtraCallback("SELECT", 3);
        public static final onExtraCallback STAR = new onExtraCallback("STAR", 4);
        public static final onExtraCallback SMALLER = new onExtraCallback("SMALLER", 5);

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 67;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            onExtraCallback[] onextracallbackArr = {BIG, MEDIUM, SMALL, SELECT, STAR, SMALLER};
            int i5 = i3 + 101;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return onextracallbackArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i4 = i3 + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = onExtraCallback + 71;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = onExtraCallback + 69;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                int i2 = 46 / 0;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        public static final onNavigationEvent CIRCLE_BIG_PRIMARY = new onNavigationEvent("CIRCLE_BIG_PRIMARY", 0, "lottie/checkbox/checkbox-circle-big-primary.json", null, false, 6, null);
        public static final onNavigationEvent CIRCLE_BIG_SECONDARY;
        public static final onNavigationEvent CIRCLE_SMALL_PRIMARY;
        public static final onNavigationEvent CIRCLE_SMALL_SECONDARY;
        public static final onWarmupCompleted Companion;
        private static int IAuthTabCallback = 1;
        public static final onNavigationEvent PRIMARY;
        public static final onNavigationEvent PRIMARY_SMALL;
        public static final onNavigationEvent SECONDARY;
        public static final onNavigationEvent STAR;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private ComposableLambdaImplExternalSyntheticLambda2 composition;
        private boolean loading;
        private final String path;

        /* renamed from: $r8$lambda$tmpFUUWSk2Nar2wfRzBX3C-SPBw, reason: not valid java name */
        public static /* synthetic */ void m94$r8$lambda$tmpFUUWSk2Nar2wfRzBX3CSPBw(onNavigationEvent onnavigationevent, ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            load$lambda$0(onnavigationevent, composableLambdaImplExternalSyntheticLambda2);
            if (i3 != 0) {
                int i4 = 94 / 0;
            }
            int i5 = onExtraCallback + 61;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 37;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            onNavigationEvent[] onnavigationeventArr = {CIRCLE_BIG_PRIMARY, CIRCLE_BIG_SECONDARY, CIRCLE_SMALL_PRIMARY, CIRCLE_SMALL_SECONDARY, PRIMARY, SECONDARY, STAR, PRIMARY_SMALL};
            int i5 = i2 + 35;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return onnavigationeventArr;
            }
            throw null;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 37;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            int i5 = i2 + 61;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = onExtraCallback + 59;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i4 = onExtraCallback + 21;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return onnavigationeventArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onNavigationEvent(String str, int i, String str2, ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2, boolean z) {
            this.path = str2;
            this.composition = composableLambdaImplExternalSyntheticLambda2;
            this.loading = z;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* synthetic */ onNavigationEvent(String str, int i, String str2, ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 2) != 0) {
                int i3 = 2 % 2;
                composableLambdaImplExternalSyntheticLambda2 = null;
            }
            ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda22 = composableLambdaImplExternalSyntheticLambda2;
            if ((i2 & 4) != 0) {
                int i4 = onExtraCallback;
                int i5 = i4 + 15;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                int i7 = i4 + 25;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 2;
                }
                z = false;
            }
            this(str, i, str2, composableLambdaImplExternalSyntheticLambda22, z);
        }

        public final ComposableLambdaImplExternalSyntheticLambda2 getComposition() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 121;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return this.composition;
            }
            throw null;
        }

        public final String getPath() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            String str = this.path;
            int i5 = i3 + 13;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final void setComposition(@Nullable ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            this.composition = composableLambdaImplExternalSyntheticLambda2;
            int i5 = i3 + 69;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2 = null;
            boolean z = false;
            int i = 6;
            DefaultConstructorMarker defaultConstructorMarker = null;
            CIRCLE_BIG_SECONDARY = new onNavigationEvent("CIRCLE_BIG_SECONDARY", 1, "lottie/checkbox/checkbox-circle-big-secondary.json", composableLambdaImplExternalSyntheticLambda2, z, i, defaultConstructorMarker);
            ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda22 = null;
            boolean z2 = false;
            int i2 = 6;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            CIRCLE_SMALL_PRIMARY = new onNavigationEvent("CIRCLE_SMALL_PRIMARY", 2, "lottie/checkbox/checkbox-circle-small-primary.json", composableLambdaImplExternalSyntheticLambda22, z2, i2, defaultConstructorMarker2);
            CIRCLE_SMALL_SECONDARY = new onNavigationEvent("CIRCLE_SMALL_SECONDARY", 3, "lottie/checkbox/checkbox-circle-small-secondary.json", composableLambdaImplExternalSyntheticLambda2, z, i, defaultConstructorMarker);
            PRIMARY = new onNavigationEvent("PRIMARY", 4, "lottie/checkbox/checkbox-primary.json", composableLambdaImplExternalSyntheticLambda22, z2, i2, defaultConstructorMarker2);
            SECONDARY = new onNavigationEvent("SECONDARY", 5, "lottie/checkbox/checkbox-secondary.json", composableLambdaImplExternalSyntheticLambda2, z, i, defaultConstructorMarker);
            STAR = new onNavigationEvent("STAR", 6, "lottie/checkbox/checkbox-star.json", composableLambdaImplExternalSyntheticLambda22, z2, i2, defaultConstructorMarker2);
            PRIMARY_SMALL = new onNavigationEvent("PRIMARY_SMALL", 7, "lottie/checkbox/checkbox-primary.json", composableLambdaImplExternalSyntheticLambda2, z, i, defaultConstructorMarker);
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            Companion = new onWarmupCompleted(null);
            int i3 = onNavigationEvent + 73;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }

        private static final void load$lambda$0(onNavigationEvent onnavigationevent, ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 55;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            onnavigationevent.composition = composableLambdaImplExternalSyntheticLambda2;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i2 + 81;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        public final void load(@NotNull Context context) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 5;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(context, "");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(context, "");
            if (this.composition == null && !this.loading) {
                this.loading = true;
                ComposableLambdaImplExternalSyntheticLambda9.onExtraCallbackWithResult(context, this.path).onExtraCallbackWithResult(new ManagedRetainedValuesStoreKtExternalSyntheticLambda0() { // from class: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View$Type$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final void onResult(Object obj2) {
                        int i3 = 2 % 2;
                        int i4 = onNavigationEvent + 119;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        TdsCheckBoxV1View.onNavigationEvent onnavigationevent = this.f$0;
                        ComposableLambdaImplExternalSyntheticLambda2 composableLambdaImplExternalSyntheticLambda2 = (ComposableLambdaImplExternalSyntheticLambda2) obj2;
                        if (i5 != 0) {
                            TdsCheckBoxV1View.onNavigationEvent.m94$r8$lambda$tmpFUUWSk2Nar2wfRzBX3CSPBw(onnavigationevent, composableLambdaImplExternalSyntheticLambda2);
                        } else {
                            TdsCheckBoxV1View.onNavigationEvent.m94$r8$lambda$tmpFUUWSk2Nar2wfRzBX3CSPBw(onnavigationevent, composableLambdaImplExternalSyntheticLambda2);
                            int i6 = 55 / 0;
                        }
                    }
                });
            }
            int i3 = onExtraCallback + 111;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }

        public static final class onWarmupCompleted {
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            /* renamed from: im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV1View$onNavigationEvent$onWarmupCompleted$onNavigationEvent, reason: collision with other inner class name */
            public static final /* synthetic */ class C0003onNavigationEvent {
                private static int IAuthTabCallback = 1;
                public static final /* synthetic */ int[] onExtraCallbackWithResult;
                private static int onNavigationEvent;

                static {
                    int[] iArr = new int[onExtraCallback.values().length];
                    try {
                        iArr[onExtraCallback.BIG.ordinal()] = 1;
                        int i = onNavigationEvent + 47;
                        IAuthTabCallback = i % 128;
                        int i2 = i % 2;
                        int i3 = 2 % 2;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[onExtraCallback.MEDIUM.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[onExtraCallback.SMALL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[onExtraCallback.SELECT.ordinal()] = 4;
                        int i4 = IAuthTabCallback + 121;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                        int i6 = 2 % 2;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[onExtraCallback.STAR.ordinal()] = 5;
                        int i7 = 2 % 2;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[onExtraCallback.SMALLER.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    onExtraCallbackWithResult = iArr;
                    int i8 = IAuthTabCallback + 9;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                }
            }

            public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onWarmupCompleted() {
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final onNavigationEvent IAuthTabCallback(@NotNull onExtraCallback onextracallback) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 109;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(onextracallback, "");
                    int i3 = 89 / 0;
                    switch (C0003onNavigationEvent.onExtraCallbackWithResult[onextracallback.ordinal()]) {
                        case 1:
                            return onNavigationEvent.CIRCLE_BIG_PRIMARY;
                        case 2:
                            onNavigationEvent onnavigationevent = onNavigationEvent.CIRCLE_SMALL_PRIMARY;
                            int i4 = onWarmupCompleted + 51;
                            onExtraCallbackWithResult = i4 % 128;
                            if (i4 % 2 != 0) {
                                int i5 = 69 / 0;
                            }
                            return onnavigationevent;
                        case 3:
                            return onNavigationEvent.PRIMARY;
                        case 4:
                            return onNavigationEvent.CIRCLE_SMALL_SECONDARY;
                        case 5:
                            return onNavigationEvent.STAR;
                        case 6:
                            return onNavigationEvent.PRIMARY_SMALL;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                Intrinsics.checkNotNullParameter(onextracallback, "");
                switch (C0003onNavigationEvent.onExtraCallbackWithResult[onextracallback.ordinal()]) {
                }
            }
        }
    }
}
