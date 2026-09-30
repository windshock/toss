package kotlin.text;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import o.setBuildFingerprint;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class StringsKt__StringBuilderJVMKt extends StringsKt__RegexExtensionsKt {
    private static final StringBuilder append(StringBuilder sb, byte b) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append((int) b);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        return sb;
    }

    private static final StringBuilder append(StringBuilder sb, short s) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append((int) s);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        return sb;
    }

    private static final StringBuilder insert(StringBuilder sb, int i, byte b) {
        Intrinsics.checkNotNullParameter(sb, "");
        StringBuilder sbInsert = sb.insert(i, (int) b);
        Intrinsics.checkNotNullExpressionValue(sbInsert, "");
        return sbInsert;
    }

    private static final StringBuilder insert(StringBuilder sb, int i, short s) {
        Intrinsics.checkNotNullParameter(sb, "");
        StringBuilder sbInsert = sb.insert(i, (int) s);
        Intrinsics.checkNotNullExpressionValue(sbInsert, "");
        return sbInsert;
    }

    public static StringBuilder clear(@NotNull StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.setLength(0);
        return sb;
    }

    private static final void set(StringBuilder sb, int i, char c) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.setCharAt(i, c);
    }

    private static final StringBuilder setRange(StringBuilder sb, int i, int i2, String str) {
        Intrinsics.checkNotNullParameter(sb, "");
        Intrinsics.checkNotNullParameter(str, "");
        StringBuilder sbReplace = sb.replace(i, i2, str);
        Intrinsics.checkNotNullExpressionValue(sbReplace, "");
        return sbReplace;
    }

    private static final StringBuilder deleteAt(StringBuilder sb, int i) {
        Intrinsics.checkNotNullParameter(sb, "");
        StringBuilder sbDeleteCharAt = sb.deleteCharAt(i);
        Intrinsics.checkNotNullExpressionValue(sbDeleteCharAt, "");
        return sbDeleteCharAt;
    }

    private static final StringBuilder deleteRange(StringBuilder sb, int i, int i2) {
        Intrinsics.checkNotNullParameter(sb, "");
        StringBuilder sbDelete = sb.delete(i, i2);
        Intrinsics.checkNotNullExpressionValue(sbDelete, "");
        return sbDelete;
    }

    static /* synthetic */ void toCharArray$default(StringBuilder sb, char[] cArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sb.length();
        }
        Intrinsics.checkNotNullParameter(sb, "");
        Intrinsics.checkNotNullParameter(cArr, "");
        sb.getChars(i2, i3, cArr, i);
    }

    private static final void toCharArray(StringBuilder sb, char[] cArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sb, "");
        Intrinsics.checkNotNullParameter(cArr, "");
        sb.getChars(i2, i3, cArr, i);
    }

    private static final StringBuilder appendRange(StringBuilder sb, char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(sb, "");
        Intrinsics.checkNotNullParameter(cArr, "");
        sb.append(cArr, i, i2 - i);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        return sb;
    }

    private static final StringBuilder appendRange(StringBuilder sb, CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(sb, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        sb.append(charSequence, i, i2);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        return sb;
    }

    private static final StringBuilder insertRange(StringBuilder sb, int i, char[] cArr, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sb, "");
        Intrinsics.checkNotNullParameter(cArr, "");
        StringBuilder sbInsert = sb.insert(i, cArr, i2, i3 - i2);
        Intrinsics.checkNotNullExpressionValue(sbInsert, "");
        return sbInsert;
    }

    private static final StringBuilder insertRange(StringBuilder sb, int i, CharSequence charSequence, int i2, int i3) {
        Intrinsics.checkNotNullParameter(sb, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        StringBuilder sbInsert = sb.insert(i, charSequence, i2, i3);
        Intrinsics.checkNotNullExpressionValue(sbInsert, "");
        return sbInsert;
    }

    private static final StringBuilder appendLine(StringBuilder sb, StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(stringBuffer);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append((CharSequence) sb2);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, int i) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(i);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, short s) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append((int) s);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, byte b) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append((int) b);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, long j) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(j);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, float f) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(f);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        return sb;
    }

    private static final StringBuilder appendLine(StringBuilder sb, double d) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(d);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        return sb;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final Appendable appendln(@NotNull Appendable appendable) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "");
        Appendable appendableAppend = appendable.append(setBuildFingerprint.IAuthTabCallback);
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "");
        return appendableAppend;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    private static final Appendable appendln(Appendable appendable, CharSequence charSequence) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "");
        Appendable appendableAppend = appendable.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "");
        return appendln(appendableAppend);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    private static final Appendable appendln(Appendable appendable, char c) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "");
        Appendable appendableAppend = appendable.append(c);
        Intrinsics.checkNotNullExpressionValue(appendableAppend, "");
        return appendln(appendableAppend);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final StringBuilder appendln(@NotNull StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(setBuildFingerprint.IAuthTabCallback);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        return sb;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    private static final StringBuilder appendln(StringBuilder sb, StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(stringBuffer);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        return appendln(sb);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    private static final StringBuilder appendln(StringBuilder sb, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        return appendln(sb);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    private static final StringBuilder appendln(StringBuilder sb, String str) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(str);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        return appendln(sb);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    private static final StringBuilder appendln(StringBuilder sb, Object obj) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(obj);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        return appendln(sb);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    private static final StringBuilder appendln(StringBuilder sb, StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append((CharSequence) sb2);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        return appendln(sb);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    private static final StringBuilder appendln(StringBuilder sb, char[] cArr) {
        Intrinsics.checkNotNullParameter(sb, "");
        Intrinsics.checkNotNullParameter(cArr, "");
        sb.append(cArr);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        return appendln(sb);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    private static final StringBuilder appendln(StringBuilder sb, char c) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(c);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        return appendln(sb);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    private static final StringBuilder appendln(StringBuilder sb, boolean z) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(z);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        return appendln(sb);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    private static final StringBuilder appendln(StringBuilder sb, int i) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(i);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        return appendln(sb);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    private static final StringBuilder appendln(StringBuilder sb, short s) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append((int) s);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        return appendln(sb);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    private static final StringBuilder appendln(StringBuilder sb, byte b) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append((int) b);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        return appendln(sb);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    private static final StringBuilder appendln(StringBuilder sb, long j) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(j);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        return appendln(sb);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    private static final StringBuilder appendln(StringBuilder sb, float f) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(f);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        return appendln(sb);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    private static final StringBuilder appendln(StringBuilder sb, double d) {
        Intrinsics.checkNotNullParameter(sb, "");
        sb.append(d);
        Intrinsics.checkNotNullExpressionValue(sb, "");
        return appendln(sb);
    }
}
