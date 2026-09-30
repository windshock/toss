package kotlin.text;

import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public class StringsKt__AppendableKt {
    public static final <T extends Appendable> T appendRange(@NotNull T t, @NotNull CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        T t2 = (T) t.append(charSequence, i, i2);
        Intrinsics.checkNotNull(t2, "");
        return t2;
    }

    public static <T extends Appendable> T append(@NotNull T t, @NotNull CharSequence... charSequenceArr) throws IOException {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(charSequenceArr, "");
        for (CharSequence charSequence : charSequenceArr) {
            t.append(charSequence);
        }
        return t;
    }

    private static final Appendable appendLine(Appendable appendable) {
        Intrinsics.checkNotNullParameter(appendable, "");
        return appendable.append('\n');
    }

    private static final Appendable appendLine(Appendable appendable, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(appendable, "");
        return appendable.append(charSequence).append('\n');
    }

    private static final Appendable appendLine(Appendable appendable, char c) {
        Intrinsics.checkNotNullParameter(appendable, "");
        return appendable.append(c).append('\n');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void appendElement(@NotNull Appendable appendable, T t, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(appendable, "");
        if (function1 != null) {
            appendable.append(function1.invoke(t));
            return;
        }
        if (t == 0 || (t instanceof CharSequence)) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(t.toString());
        }
    }
}
