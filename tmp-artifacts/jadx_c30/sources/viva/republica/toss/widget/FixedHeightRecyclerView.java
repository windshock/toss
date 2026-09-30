package viva.republica.toss.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class FixedHeightRecyclerView extends RecyclerView {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private int onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FixedHeightRecyclerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FixedHeightRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedHeightRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FixedHeightRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallback + 17;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 87 / 0;
            }
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = onExtraCallback + 101;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void setFixedHeight(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 77;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        this.onWarmupCompleted = i;
        if (i5 == 0) {
            int i6 = 68 / 0;
        }
        int i7 = i3 + 67;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        if (this.onWarmupCompleted == 0) {
            int i4 = onExtraCallbackWithResult + 93;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (getMeasuredHeight() > 0) {
                this.onWarmupCompleted = getMeasuredHeight();
            }
        }
        int i6 = this.onWarmupCompleted;
        if (i6 > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            return;
        }
        super.onMeasure(i, i2);
        int i7 = onExtraCallback + 21;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
    }
}
