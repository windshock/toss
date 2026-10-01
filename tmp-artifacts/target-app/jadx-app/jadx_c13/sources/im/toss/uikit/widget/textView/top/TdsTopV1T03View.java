package im.toss.uikit.widget.textView.top;

import android.content.Context;
import android.util.AttributeSet;
import im.toss.tds.view.R;
import im.toss.tds.view.component.atom.text.Typography3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsTopV1T03View extends Typography3 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTopV1T03View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTopV1T03View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsTopV1T03View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsTopV1T03View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onNavigationEvent + 11;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = onWarmupCompleted + 33;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public int extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 107;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.dimen.top_top_padding_24;
            throw null;
        }
        int i4 = R.dimen.top_top_padding_24;
        int i5 = onNavigationEvent + 9;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public int writeTypedObject() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.top_bottom_padding_0;
        int i5 = onNavigationEvent + 33;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public int ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.top_left_padding_24;
        int i5 = onNavigationEvent + 73;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public int readTypedObject() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.dimen.top_right_padding_24;
        if (i3 != 0) {
            return i4;
        }
        throw null;
    }

    public response onPostMessage() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        response responseVar = response.Bold;
        int i4 = onNavigationEvent + 101;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return responseVar;
    }
}
