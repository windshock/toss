package viva.republica.toss.network.model.common;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import im.toss.featurescommon.contacts.library.Receivable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.VideoConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ReceivableExtKt {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ CharSequence IAuthTabCallback(Receivable receivable, CharSequence charSequence, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            int i5 = i3 + 97;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            charSequence = "";
        }
        return IAuthTabCallback(receivable, charSequence);
    }

    public static final CharSequence IAuthTabCallback(@NotNull Receivable receivable, @NotNull CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(receivable, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            return onExtraCallback(receivable.onExtraCallback(), charSequence.toString());
        }
        Intrinsics.checkNotNullParameter(receivable, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        onExtraCallback(receivable.onExtraCallback(), charSequence.toString());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final CharSequence onExtraCallbackWithResult(@NotNull Receivable receivable, @NotNull CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(receivable, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        CharSequence charSequenceIAuthTabCallback = VideoConfig.IAuthTabCallback(receivable.IAuthTabCallbackStub(), charSequence.toString());
        int i4 = onWarmupCompleted + 25;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
        return charSequenceIAuthTabCallback;
    }

    public static /* synthetic */ CharSequence onExtraCallback(CharSequence charSequence, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 21;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 51;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            str = "";
        }
        CharSequence charSequenceOnExtraCallback = onExtraCallback(charSequence, str);
        int i8 = onExtraCallback + 31;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return charSequenceOnExtraCallback;
    }

    public static final CharSequence onExtraCallback(@NotNull CharSequence charSequence, @NotNull String str) {
        int iIndexOf$default;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (!TextUtils.isEmpty(str)) {
            int i2 = onWarmupCompleted + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (StringsKt.contains$default(charSequence, str, false, 2, (Object) null) && (iIndexOf$default = StringsKt.indexOf$default(charSequence, str, 0, false, 6, (Object) null)) >= 0) {
                SpannableString spannableString = new SpannableString(charSequence);
                spannableString.setSpan(new StyleSpan(1), iIndexOf$default, str.length() + iIndexOf$default, 33);
                return spannableString;
            }
        }
        int i4 = onWarmupCompleted + 125;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return charSequence;
    }
}
