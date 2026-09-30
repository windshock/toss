package im.toss.tds.view.component.atom.text;

import android.content.Context;
import android.util.AttributeSet;
import im.toss.tds.view.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.deprecated_code;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class SubTypography1 extends BaseTextView {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubTypography1(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubTypography1(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubTypography1(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SubTypography1(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = onWarmupCompleted;
            int i6 = i5 + 25;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 71;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @Override // im.toss.tds.view.component.atom.text.BaseTextView
    public int bw_() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.text_sub_typography_1;
        if (i3 != 0) {
            int i5 = 29 / 0;
        }
        return i4;
    }

    @Override // im.toss.tds.view.component.atom.text.BaseTextView
    public int bv_() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = R.dimen.line_height_sub_typography_1;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = R.dimen.line_height_sub_typography_1;
        int i5 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // im.toss.tds.view.component.atom.text.BaseTextView
    protected deprecated_code onActivityResized() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        deprecated_code deprecated_codeVar = deprecated_code.TITLE;
        if (i3 != 0) {
            return deprecated_codeVar;
        }
        throw null;
    }
}
