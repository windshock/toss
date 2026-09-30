package im.toss.uikit.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import im.toss.tds.view.component.widget.TdsScrollView;
import im.toss.uikit.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class MaxHeightScrollView extends TdsScrollView {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private int onExtraCallback;

    static {
        int i = onExtraCallbackWithResult + 115;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            int i2 = 53 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxHeightScrollView(@NotNull Context context) {
        super(context, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MaxHeightScrollView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, 12, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        if (!isInEditMode()) {
            onExtraCallback(context, attributeSet);
            int i = onWarmupCompleted + 25;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        }
        int i3 = IAuthTabCallback + 125;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MaxHeightScrollView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        if (!isInEditMode()) {
            onExtraCallback(context, attributeSet);
            int i2 = IAuthTabCallback + 59;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        }
        int i4 = IAuthTabCallback + 35;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(Context context, AttributeSet attributeSet) {
        int i = 2 % 2;
        Float fValueOf = Float.valueOf(200.0f);
        if (attributeSet == null) {
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            this.onExtraCallback = varyMatches.onNavigationEvent(fValueOf, displayMetrics);
            return;
        }
        int i2 = IAuthTabCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MaxHeightScrollView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int i4 = R.styleable.MaxHeightScrollView_maxHeight;
        DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        this.onExtraCallback = typedArrayObtainStyledAttributes.getDimensionPixelSize(i4, varyMatches.onNavigationEvent(fValueOf, displayMetrics2));
        typedArrayObtainStyledAttributes.recycle();
        int i5 = IAuthTabCallback + 25;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 37;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            super/*android.view.View*/.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.onExtraCallback, Integer.MIN_VALUE));
            return;
        }
        super/*android.view.View*/.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.onExtraCallback, Integer.MIN_VALUE));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setMaxHeight(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 87;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            this.onExtraCallback = i;
            requestLayout();
        } else {
            this.onExtraCallback = i;
            requestLayout();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
