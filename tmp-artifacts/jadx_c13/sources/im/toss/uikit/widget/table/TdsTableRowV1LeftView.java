package im.toss.uikit.widget.table;

import android.content.Context;
import android.util.AttributeSet;
import im.toss.uikit.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsTableRowV1LeftView extends TdsTableRowV1View {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTableRowV1LeftView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTableRowV1LeftView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsTableRowV1LeftView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsTableRowV1LeftView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallback + 109;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = onExtraCallback + 77;
            int i7 = i6 % 128;
            onNavigationEvent = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 67;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @Override // im.toss.uikit.widget.table.TdsTableRowV1View
    public int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.tds_table_row_v1_left;
        int i5 = onNavigationEvent + 39;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }
}
