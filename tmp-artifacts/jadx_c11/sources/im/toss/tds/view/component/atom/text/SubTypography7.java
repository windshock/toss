package im.toss.tds.view.component.atom.text;

import android.content.Context;
import android.util.AttributeSet;
import im.toss.tds.view.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class SubTypography7 extends BaseTextView {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubTypography7(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubTypography7(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubTypography7(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SubTypography7(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallback + 89;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = onExtraCallback + 57;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @Override // im.toss.tds.view.component.atom.text.BaseTextView
    public int bw_() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.dimen.text_sub_typography_7;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = R.dimen.text_sub_typography_7;
        int i5 = onExtraCallbackWithResult + 19;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 67 / 0;
        }
        return i4;
    }

    @Override // im.toss.tds.view.component.atom.text.BaseTextView
    public int bv_() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.line_height_sub_typography_7;
        int i5 = onExtraCallbackWithResult + 103;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }
}
