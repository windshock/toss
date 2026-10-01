package im.toss.tds.view.component.anim.logo;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import im.toss.tds.view.R;
import im.toss.tds.view.component.widget.TdsRecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Address;
import o.access15300;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class SlidingRecyclerView extends TdsRecyclerView {
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private float IAuthTabCallback;
    private boolean IAuthTabCallbackStub;
    private onNavigationEvent asInterface;
    private ValueAnimator onExtraCallback;
    private onExtraCallbackWithResult onExtraCallbackWithResult;
    private float onNavigationEvent;
    private boolean onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SlidingRecyclerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SlidingRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void onWarmupCompleted(SlidingRecyclerView slidingRecyclerView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(slidingRecyclerView, valueAnimator);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onTransact + 65;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SlidingRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws NoWhenBranchMatchedException {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.asInterface = onNavigationEvent.NORMAL;
        this.IAuthTabCallback = 1.0f;
        this.onExtraCallbackWithResult = onExtraCallbackWithResult.HORIZONTAL_LEFT;
        this.IAuthTabCallbackStub = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.SlidingRecyclerView, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i2 = 2 % 2;
            for (int i3 = 0; i3 < indexCount; i3++) {
                int i4 = IAuthTabCallbackDefault + 87;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == R.styleable.SlidingRecyclerView_slidingDirection) {
                    this.onExtraCallbackWithResult = onExtraCallbackWithResult.values()[typedArrayObtainStyledAttributes.getInt(index, 0)];
                    int i6 = IAuthTabCallbackDefault + 111;
                    onTransact = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            int i8 = onTransact + 23;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
        }
        setOverScrollMode(2);
        setDirection(this.onExtraCallbackWithResult);
        setFading(true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SlidingRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallbackDefault + 19;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = IAuthTabCallbackDefault + 13;
            int i5 = i4 % 128;
            onTransact = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 15;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onNavigationEvent {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onNavigationEvent[] $VALUES;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        private final int value;
        public static final onNavigationEvent SLOW = new onNavigationEvent("SLOW", 0, 1);
        public static final onNavigationEvent NORMAL = new onNavigationEvent("NORMAL", 1, 2);
        public static final onNavigationEvent FAST = new onNavigationEvent("FAST", 2, 3);

        private static final /* synthetic */ onNavigationEvent[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            onNavigationEvent[] onnavigationeventArr = {SLOW, NORMAL, FAST};
            int i5 = i3 + 59;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return onnavigationeventArr;
        }

        public static EnumEntries<onNavigationEvent> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            EnumEntries<onNavigationEvent> enumEntries = $ENTRIES;
            if (i3 != 0) {
                int i4 = 25 / 0;
            }
            return enumEntries;
        }

        public static onNavigationEvent valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationevent = (onNavigationEvent) Enum.valueOf(onNavigationEvent.class, str);
            int i4 = onExtraCallback + 61;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onnavigationevent;
        }

        public static onNavigationEvent[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onNavigationEvent[] onnavigationeventArr = (onNavigationEvent[]) $VALUES.clone();
            int i3 = onExtraCallback + 15;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return onnavigationeventArr;
        }

        private onNavigationEvent(String str, int i, int i2) {
            this.value = i2;
        }

        public final int getValue() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 85;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.value;
            int i6 = i2 + 67;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 63 / 0;
            }
            return i5;
        }

        static {
            onNavigationEvent[] onnavigationeventArr$values = $values();
            $VALUES = onnavigationeventArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onnavigationeventArr$values);
            int i = onWarmupCompleted + 59;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        public static final onExtraCallbackWithResult HORIZONTAL_LEFT = new onExtraCallbackWithResult("HORIZONTAL_LEFT", 0);
        public static final onExtraCallbackWithResult HORIZONTAL_RIGHT = new onExtraCallbackWithResult("HORIZONTAL_RIGHT", 1);
        public static final onExtraCallbackWithResult VERTICAL_DOWN = new onExtraCallbackWithResult("VERTICAL_DOWN", 2);
        public static final onExtraCallbackWithResult VERTICAL_UP = new onExtraCallbackWithResult("VERTICAL_UP", 3);
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            onExtraCallbackWithResult[] onextracallbackwithresultArr;
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult onextracallbackwithresult = HORIZONTAL_LEFT;
                onExtraCallbackWithResult onextracallbackwithresult2 = HORIZONTAL_RIGHT;
                onExtraCallbackWithResult onextracallbackwithresult3 = VERTICAL_DOWN;
                onExtraCallbackWithResult onextracallbackwithresult4 = VERTICAL_UP;
                onextracallbackwithresultArr = new onExtraCallbackWithResult[5];
                onextracallbackwithresultArr[1] = onextracallbackwithresult;
                onextracallbackwithresultArr[0] = onextracallbackwithresult2;
                onextracallbackwithresultArr[2] = onextracallbackwithresult3;
                onextracallbackwithresultArr[3] = onextracallbackwithresult4;
            } else {
                onextracallbackwithresultArr = new onExtraCallbackWithResult[]{HORIZONTAL_LEFT, HORIZONTAL_RIGHT, VERTICAL_DOWN, VERTICAL_UP};
            }
            int i4 = i3 + 67;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return $ENTRIES;
            }
            throw null;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 == 0) {
                throw null;
            }
            int i4 = onWarmupCompleted + 97;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 113;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 79;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresultArr;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onNavigationEvent + 19;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }
    }

    public final void setCustomSpeed(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback = f;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean onWarmupCompleted() {
        int i = 2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = this.onExtraCallbackWithResult;
        if (onextracallbackwithresult == onExtraCallbackWithResult.VERTICAL_DOWN) {
            return true;
        }
        int i2 = onTransact + 113;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        if (onextracallbackwithresult == onExtraCallbackWithResult.VERTICAL_UP) {
            return true;
        }
        int i4 = onTransact + 37;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = this.onExtraCallbackWithResult;
        if (onextracallbackwithresult != onExtraCallbackWithResult.VERTICAL_DOWN) {
            int i2 = onTransact + 33;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            if (onextracallbackwithresult != onExtraCallbackWithResult.HORIZONTAL_RIGHT) {
                return false;
            }
        }
        int i4 = onTransact + 117;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final void setShowFadingEdge(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 41;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackStub = z;
        int i5 = i2 + 33;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setEnableTouchEvent(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        this.onWarmupCompleted = z;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 21;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setDirection(@NotNull onExtraCallbackWithResult onextracallbackwithresult) throws NoWhenBranchMatchedException {
        LinearLayoutManager linearLayoutManager;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.onExtraCallbackWithResult = onextracallbackwithresult;
        int i4 = onWarmupCompleted.IAuthTabCallback[onextracallbackwithresult.ordinal()];
        if (i4 != 1) {
            int i5 = IAuthTabCallbackDefault;
            int i6 = i5 + 99;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            if (i4 != 2) {
                int i8 = i5 + 53;
                onTransact = i8 % 128;
                if (i8 % 2 != 0 ? i4 != 3 : i4 != 3) {
                    if (i4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                linearLayoutManager = new LinearLayoutManager(getContext(), 1, onExtraCallbackWithResult());
                int i9 = onTransact + 117;
                IAuthTabCallbackDefault = i9 % 128;
                int i10 = i9 % 2;
            } else {
                linearLayoutManager = new LinearLayoutManager(getContext(), 0, onExtraCallbackWithResult());
            }
        }
        setLayoutManager(linearLayoutManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setFading(boolean z) {
        boolean z2;
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 101;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z3 = true;
        if (z) {
            int i4 = i2 + 93;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            if (onWarmupCompleted()) {
                z2 = false;
            } else {
                int i6 = IAuthTabCallbackDefault + 7;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                z2 = true;
            }
        }
        setHorizontalFadingEdgeEnabled(z2);
        if (z) {
            int i8 = onTransact + 79;
            IAuthTabCallbackDefault = i8 % 128;
            if (i8 % 2 == 0 ? !onWarmupCompleted() : !onWarmupCompleted()) {
                z3 = false;
            }
        }
        setVerticalFadingEdgeEnabled(z3);
    }

    public final void setSpeed(@NotNull onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            this.asInterface = onnavigationevent;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        this.asInterface = onnavigationevent;
        int i3 = onTransact + 107;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        ValueAnimator valueAnimator = this.onExtraCallback;
        if (valueAnimator != null) {
            int i2 = IAuthTabCallbackDefault + 47;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                valueAnimator.cancel();
                int i3 = 68 / 0;
            } else {
                valueAnimator.cancel();
            }
        }
        this.onNavigationEvent = 0.0f;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 1000);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.tds.view.component.anim.logo.SlidingRecyclerView$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 115;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                SlidingRecyclerView.onWarmupCompleted(this.f$0, valueAnimator2);
                int i7 = onWarmupCompleted + 47;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        valueAnimatorOfInt.setDuration(1000L);
        valueAnimatorOfInt.setInterpolator(Address.onNavigationEvent.asInterface());
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setRepeatMode(1);
        valueAnimatorOfInt.start();
        this.onExtraCallback = valueAnimatorOfInt;
        int i4 = IAuthTabCallbackDefault + 25;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onNavigationEvent(SlidingRecyclerView slidingRecyclerView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        float value = slidingRecyclerView.onNavigationEvent + (slidingRecyclerView.asInterface.getValue() * slidingRecyclerView.IAuthTabCallback * (slidingRecyclerView.onExtraCallbackWithResult() ? -1 : 1));
        slidingRecyclerView.onNavigationEvent = value;
        int i2 = (int) value;
        if (i2 != 0 && slidingRecyclerView.getScrollState() == 0) {
            int i3 = IAuthTabCallbackDefault + 19;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            int i6 = !slidingRecyclerView.onWarmupCompleted() ? i2 : 0;
            if (!(true ^ slidingRecyclerView.onWarmupCompleted())) {
                int i7 = onTransact + 105;
                IAuthTabCallbackDefault = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 43 / 0;
                }
                i5 = i2;
            }
            slidingRecyclerView.scrollBy(i6, i5);
            slidingRecyclerView.onNavigationEvent -= i2;
        }
        int i9 = IAuthTabCallbackDefault + 57;
        onTransact = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 23;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        super/*androidx.recyclerview.widget.RecyclerView*/.onMeasure(i, i2);
        if (this.IAuthTabCallbackStub) {
            if (onWarmupCompleted()) {
                measuredHeight = getMeasuredHeight();
            } else {
                int i6 = IAuthTabCallbackDefault + 19;
                onTransact = i6 % 128;
                if (i6 % 2 == 0) {
                    getMeasuredWidth();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                measuredHeight = getMeasuredWidth();
            }
            float f = measuredHeight;
            int i7 = IAuthTabCallbackDefault + 3;
            onTransact = i7 % 128;
            setFadingEdgeLength((int) (i7 % 2 == 0 ? f % 0.3f : f * 0.3f));
        }
    }

    public boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
        int i = 2 % 2;
        if (this.onWarmupCompleted) {
            int i2 = IAuthTabCallbackDefault + 45;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return super/*androidx.recyclerview.widget.RecyclerView*/.onInterceptTouchEvent(motionEvent);
        }
        int i4 = IAuthTabCallbackDefault + 9;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return false;
    }

    public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        if (this.onWarmupCompleted) {
            return super/*androidx.recyclerview.widget.RecyclerView*/.onTouchEvent(motionEvent);
        }
        int i5 = i3 + 83;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.onExtraCallback;
        if (valueAnimator != null) {
            int i4 = onTransact + 9;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            valueAnimator.cancel();
            int i6 = IAuthTabCallbackDefault + 97;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
        }
    }
}
