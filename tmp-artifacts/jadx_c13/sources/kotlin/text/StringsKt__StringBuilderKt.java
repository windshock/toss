package kotlin.text;

import kotlin.Deprecated;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class StringsKt__StringBuilderKt extends StringsKt__StringBuilderJVMKt {
    @Deprecated
    private static final StringBuilder append(StringBuilder sb, Object obj) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(obj);
        return sb;
    }

    private static final String buildString(Function1<? super StringBuilder, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        StringBuilder sb = new StringBuilder();
        function1.invoke(sb);
        return sb.toString();
    }

    private static final String buildString(int i, Function1<? super StringBuilder, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        StringBuilder sb = new StringBuilder(i);
        function1.invoke(sb);
        return sb.toString();
    }

    public static final StringBuilder append(@NotNull StringBuilder sb, @NotNull String... strArr) {
        Intrinsics.checkNotNullParameter(sb, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        for (String str : strArr) {
            sb.append(str);
        }
        return sb;
    }

    public static final StringBuilder append(@NotNull StringBuilder sb, @NotNull Object... objArr) {
        Intrinsics.checkNotNullParameter(sb, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        for (Object obj : objArr) {
            sb.append(obj);
        }
        return sb;
    }

    @Deprecated
    private static final StringBuilder append(StringBuilder sb, char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(sb, "");
        Intrinsics.checkNotNullParameter(cArr, "");
        throw new NotImplementedError(null, 1, null);
    }

    private static final StringBuilder appendLine(StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append('\n');
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(charSequence);
        sb.append('\n');
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, String str) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(str);
        sb.append('\n');
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, Object obj) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(obj);
        sb.append('\n');
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, char[] cArr) {
        Intrinsics.checkNotNullParameter(sb, "");
        Intrinsics.checkNotNullParameter(cArr, "");
        sb.append(cArr);
        sb.append('\n');
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, char c) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(c);
        sb.append('\n');
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, boolean z) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(z);
        sb.append('\n');
        return sb;
    }
}
