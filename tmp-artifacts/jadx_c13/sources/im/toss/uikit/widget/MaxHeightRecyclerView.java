package im.toss.uikit.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import im.toss.tds.view.component.widget.TdsRecyclerView;
import im.toss.uikit.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class MaxHeightRecyclerView extends TdsRecyclerView {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private int onExtraCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxHeightRecyclerView(@NotNull Context context) {
        super(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MaxHeightRecyclerView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.onExtraCallback = -1;
        if (!isInEditMode()) {
            onExtraCallback(context, attributeSet);
            int i = onExtraCallbackWithResult + 63;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        int i4 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MaxHeightRecyclerView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.onExtraCallback = -1;
        if (!isInEditMode()) {
            onExtraCallback(context, attributeSet);
            int i2 = onNavigationEvent + 109;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 5;
            } else {
                int i4 = 2 % 2;
            }
        }
        int i5 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void onExtraCallback(Context context, AttributeSet attributeSet) {
        int i = 2 % 2;
        if (attributeSet != null) {
            int i2 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MaxHeightRecyclerView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            this.onExtraCallback = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MaxHeightRecyclerView_maxHeight, -1);
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        this.onExtraCallback = -1;
        int i4 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 15;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        int i7 = this.onExtraCallback;
        if (i7 >= 0) {
            int i8 = i5 + 33;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                super/*androidx.recyclerview.widget.RecyclerView*/.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
                return;
            }
            super/*androidx.recyclerview.widget.RecyclerView*/.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super/*androidx.recyclerview.widget.RecyclerView*/.onMeasure(i, i2);
    }

    public final void setMaxHeight(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallback = i;
        requestLayout();
        int i5 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }
}
