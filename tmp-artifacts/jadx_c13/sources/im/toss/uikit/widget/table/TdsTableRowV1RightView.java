package im.toss.uikit.widget.table;

import android.content.Context;
import android.util.AttributeSet;
import im.toss.uikit.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsTableRowV1RightView extends TdsTableRowV1View {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTableRowV1RightView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTableRowV1RightView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsTableRowV1RightView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsTableRowV1RightView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 29 / 0;
            }
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = onExtraCallbackWithResult;
            int i7 = i6 + 57;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 105;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @Override // im.toss.uikit.widget.table.TdsTableRowV1View
    public int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.tds_table_row_v1_right;
        if (i3 == 0) {
            return i4;
        }
        throw null;
    }
}
