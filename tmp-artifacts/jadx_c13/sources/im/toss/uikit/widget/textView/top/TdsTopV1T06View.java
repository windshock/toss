package im.toss.uikit.widget.textView.top;

import android.content.Context;
import android.util.AttributeSet;
import im.toss.tds.view.R;
import im.toss.tds.view.component.atom.text.Typography7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsTopV1T06View extends Typography7 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTopV1T06View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTopV1T06View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsTopV1T06View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsTopV1T06View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallbackWithResult + 107;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 77;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 % 4;
            } else {
                int i8 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i9 = onWarmupCompleted;
            int i10 = i9 + 37;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 + 97;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public int extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.top_top_padding_8;
        int i5 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public int writeTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.top_bottom_padding_0;
        if (i3 == 0) {
            return i4;
        }
        throw null;
    }

    public int ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 109;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.top_left_padding_24;
        int i5 = onWarmupCompleted + 21;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public int readTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.top_right_padding_24;
        if (i3 == 0) {
            return i4;
        }
        throw null;
    }
}
