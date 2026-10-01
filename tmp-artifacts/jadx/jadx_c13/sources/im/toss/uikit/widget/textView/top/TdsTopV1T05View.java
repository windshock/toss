package im.toss.uikit.widget.textView.top;

import android.content.Context;
import android.util.AttributeSet;
import im.toss.tds.view.R;
import im.toss.tds.view.component.atom.text.Typography5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsTopV1T05View extends Typography5 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTopV1T05View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTopV1T05View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsTopV1T05View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsTopV1T05View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallbackWithResult + 77;
            onExtraCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = onExtraCallbackWithResult;
            int i5 = i4 + 109;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 59;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public int extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.top_top_padding_16;
        int i5 = onExtraCallbackWithResult + 95;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public int writeTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.top_bottom_padding_0;
        int i5 = onExtraCallbackWithResult + 27;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public int ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.top_left_padding_24;
        int i5 = onExtraCallbackWithResult + 15;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public int readTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.top_right_padding_24;
        int i5 = onExtraCallbackWithResult + 29;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }
}
