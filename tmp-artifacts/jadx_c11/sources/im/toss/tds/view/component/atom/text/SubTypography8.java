package im.toss.tds.view.component.atom.text;

import android.content.Context;
import android.util.AttributeSet;
import im.toss.tds.view.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class SubTypography8 extends BaseTextView {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubTypography8(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubTypography8(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubTypography8(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SubTypography8(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onNavigationEvent + 59;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = onNavigationEvent + 119;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @Override // im.toss.tds.view.component.atom.text.BaseTextView
    public int bw_() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.text_sub_typography_8;
        int i5 = onNavigationEvent + 61;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // im.toss.tds.view.component.atom.text.BaseTextView
    public int bv_() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.line_height_sub_typography_8;
        int i5 = onNavigationEvent + 15;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
        return i4;
    }
}
