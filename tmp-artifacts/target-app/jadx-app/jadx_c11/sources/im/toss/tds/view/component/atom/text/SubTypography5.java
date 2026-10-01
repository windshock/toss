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
public class SubTypography5 extends BaseTextView {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubTypography5(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubTypography5(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubTypography5(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SubTypography5(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallbackWithResult + 75;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 85;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i8 = onNavigationEvent + 107;
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
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.dimen.text_sub_typography_5;
            int i4 = 73 / 0;
        } else {
            i = R.dimen.text_sub_typography_5;
        }
        int i5 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return i;
        }
        throw null;
    }

    @Override // im.toss.tds.view.component.atom.text.BaseTextView
    public int bv_() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.line_height_sub_typography_5;
        if (i3 != 0) {
            int i5 = 67 / 0;
        }
        return i4;
    }

    @Override // im.toss.tds.view.component.atom.text.BaseTextView
    protected deprecated_code onActivityResized() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        deprecated_code deprecated_codeVar = deprecated_code.TITLE;
        if (i3 != 0) {
            return deprecated_codeVar;
        }
        throw null;
    }
}
