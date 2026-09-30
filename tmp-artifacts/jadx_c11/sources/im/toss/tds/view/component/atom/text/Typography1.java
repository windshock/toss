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
public class Typography1 extends BaseTextView {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Typography1(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Typography1(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Typography1(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Typography1(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = onExtraCallbackWithResult;
            int i5 = i4 + 89;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 73;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @Override // im.toss.tds.view.component.atom.text.BaseTextView
    public int bw_() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.text_typography_1;
        int i5 = onExtraCallbackWithResult + 27;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // im.toss.tds.view.component.atom.text.BaseTextView
    public int bv_() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.line_height_typography_1;
        int i5 = onExtraCallbackWithResult + 87;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    @Override // im.toss.tds.view.component.atom.text.BaseTextView
    protected deprecated_code onActivityResized() {
        deprecated_code deprecated_codeVar;
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            deprecated_codeVar = deprecated_code.TITLE;
            int i3 = 92 / 0;
        } else {
            deprecated_codeVar = deprecated_code.TITLE;
        }
        int i4 = onExtraCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_codeVar;
    }
}
