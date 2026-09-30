package kotlin.text;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class StringsKt__RegexExtensionsJVMKt extends StringsKt__IndentKt {
    private static final Regex toRegex(Pattern pattern) {
        Intrinsics.checkNotNullParameter(pattern, "");
        return new Regex(pattern);
    }
}
