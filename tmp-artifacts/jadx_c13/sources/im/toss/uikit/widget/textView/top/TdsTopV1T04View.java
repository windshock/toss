package im.toss.uikit.widget.textView.top;

import android.content.Context;
import android.util.AttributeSet;
import im.toss.tds.view.R;
import im.toss.tds.view.component.atom.text.Typography4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsTopV1T04View extends Typography4 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTopV1T04View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTopV1T04View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsTopV1T04View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsTopV1T04View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallbackWithResult + 75;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i4 = onExtraCallback + 7;
            int i5 = i4 % 128;
            onExtraCallbackWithResult = i5;
            i = i4 % 2 != 0 ? 1 : 0;
            int i6 = i5 + 93;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
        }
        this(context, attributeSet, i);
    }

    public int extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.dimen.top_top_padding_24;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = R.dimen.top_top_padding_24;
        int i5 = onExtraCallback + 59;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public int writeTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.top_bottom_padding_0;
        int i5 = onExtraCallbackWithResult + 33;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public int ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.top_left_padding_24;
        if (i3 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int readTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.top_right_padding_24;
        if (i3 == 0) {
            int i5 = 23 / 0;
        }
        return i4;
    }

    public response onPostMessage() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        response responseVar = response.Bold;
        int i4 = onExtraCallbackWithResult + 43;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return responseVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
