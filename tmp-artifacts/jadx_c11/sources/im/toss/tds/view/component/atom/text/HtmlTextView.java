package im.toss.tds.view.component.atom.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import im.toss.tds.view.R;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.isExecuted;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class HtmlTextView extends LineHeightBasedTextView {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HtmlTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HtmlTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HtmlTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.HtmlTextView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            String string = typedArrayObtainStyledAttributes.getString(R.styleable.HtmlTextView_html);
            if (!TextUtils.isEmpty(string)) {
                int i2 = onWarmupCompleted + 123;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                setHtml(string);
            }
            typedArrayObtainStyledAttributes.recycle();
            int i4 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HtmlTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallbackWithResult + 87;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setHtml(@Nullable String str) {
        CharSequence charSequenceIAuthTabCallback;
        int i = 2 % 2;
        if (str != null) {
            int i2 = onExtraCallbackWithResult + 97;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 / 0;
                if (!TextUtils.isEmpty(str)) {
                    charSequenceIAuthTabCallback = IAuthTabCallback(str, new Object[0]);
                    int i4 = onWarmupCompleted + 79;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    charSequenceIAuthTabCallback = "";
                }
            } else if (!TextUtils.isEmpty(str)) {
            }
        }
        setText(charSequenceIAuthTabCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setHtml(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            String string = getContext().getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            setHtml(string);
            int i4 = onWarmupCompleted + 71;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        String string2 = getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        setHtml(string2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onActivityLayout() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            setMovementMethod(LinkMovementMethod.getInstance());
            int i3 = 57 / 0;
        } else {
            setMovementMethod(LinkMovementMethod.getInstance());
        }
        int i4 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Spanned IAuthTabCallback(@NotNull String str, @NotNull Object... objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        isExecuted isexecuted = isExecuted.IAuthTabCallback;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Spanned spannedOnNavigationEvent = isExecuted.onNavigationEvent(isexecuted, str, objArrCopyOf, context, null, null, false, false, null, 216, null);
        int i4 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return spannedOnNavigationEvent;
    }
}
