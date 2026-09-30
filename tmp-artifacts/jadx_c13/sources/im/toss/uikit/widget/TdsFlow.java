package im.toss.uikit.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsFlow extends Flow {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private ConstraintLayout onExtraCallback;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsFlow(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsFlow(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsFlow(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsFlow(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onWarmupCompleted + 111;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 54 / 0;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = onWarmupCompleted + 37;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 2;
            } else {
                int i7 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void setFlowParent(@Nullable ConstraintLayout constraintLayout) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        this.onExtraCallback = constraintLayout;
        int i5 = i3 + 101;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }
}
