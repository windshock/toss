package kotlin.text;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import o.clearSelinuxLabel;
import o.clearSignalInfo;
import o.setArch;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Regex implements Serializable {
    public static final Companion Companion = new Companion(null);
    private Set<? extends RegexOption> _options;
    private final Pattern nativePattern;

    public Regex(@NotNull Pattern pattern) {
        Intrinsics.checkNotNullParameter(pattern, "");
        this.nativePattern = pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Pattern patternCompile = Pattern.compile(str);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String str, @NotNull RegexOption regexOption) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(regexOption, "");
        Pattern patternCompile = Pattern.compile(str, Companion.onExtraCallbackWithResult(regexOption.getValue()));
        Intrinsics.checkNotNullExpressionValue(patternCompile, "");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String str, @NotNull Set<? extends RegexOption> set) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(set, "");
        Pattern patternCompile = Pattern.compile(str, Companion.onExtraCallbackWithResult(RegexKt.toInt(set)));
        Intrinsics.checkNotNullExpressionValue(patternCompile, "");
        this(patternCompile);
    }

    public final String onNavigationEvent() {
        String strPattern = this.nativePattern.pattern();
        Intrinsics.checkNotNullExpressionValue(strPattern, "");
        return strPattern;
    }

    public final boolean onExtraCallbackWithResult(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        return this.nativePattern.matcher(charSequence).matches();
    }

    public final boolean onExtraCallback(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        return this.nativePattern.matcher(charSequence).find();
    }

    public static /* synthetic */ MatchResult find$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.onExtraCallbackWithResult(charSequence, i);
    }

    public final MatchResult onExtraCallbackWithResult(@NotNull CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        Intrinsics.checkNotNullExpressionValue(matcher, "");
        return RegexKt.findNext(matcher, i, charSequence);
    }

    public static /* synthetic */ Sequence onExtraCallbackWithResult(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.onExtraCallback(charSequence, i);
    }

    public final Sequence<MatchResult> onExtraCallback(@NotNull final CharSequence charSequence, final int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (i < 0 || i > charSequence.length()) {
            throw new IndexOutOfBoundsException("Start index out of bounds: " + i + ", input length: " + charSequence.length());
        }
        return clearSelinuxLabel.onNavigationEvent(new Function0() { // from class: kotlin.text.Regex$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Regex.onExtraCallbackWithResult(this.f$0, charSequence, i);
            }
        }, Regex$findAll$2.onWarmupCompleted);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchResult onExtraCallbackWithResult(Regex regex, CharSequence charSequence, int i) {
        return regex.onExtraCallbackWithResult(charSequence, i);
    }

    public final MatchResult onNavigationEvent(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        Intrinsics.checkNotNullExpressionValue(matcher, "");
        return RegexKt.matchEntire(matcher, charSequence);
    }

    public final MatchResult onNavigationEvent(@NotNull CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Matcher matcherRegion = this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length());
        if (!matcherRegion.lookingAt()) {
            return null;
        }
        Intrinsics.checkNotNull(matcherRegion);
        return new setArch(matcherRegion, charSequence);
    }

    public final String replace(@NotNull CharSequence charSequence, @NotNull String str) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str, "");
        String strReplaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        Intrinsics.checkNotNullExpressionValue(strReplaceAll, "");
        return strReplaceAll;
    }

    public final String onNavigationEvent(@NotNull CharSequence charSequence, @NotNull Function1<? super MatchResult, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        int iIntValue = 0;
        MatchResult matchResultFind$default = find$default(this, charSequence, 0, 2, null);
        if (matchResultFind$default == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, iIntValue, matchResultFind$default.onExtraCallback().getStart().intValue());
            sb.append(function1.invoke(matchResultFind$default));
            iIntValue = matchResultFind$default.onExtraCallback().getEndInclusive().intValue() + 1;
            matchResultFind$default = matchResultFind$default.onNavigationEvent();
            if (iIntValue >= length) {
                break;
            }
        } while (matchResultFind$default != null);
        if (iIntValue < length) {
            sb.append(charSequence, iIntValue, length);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final String onNavigationEvent(@NotNull CharSequence charSequence, @NotNull String str) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str, "");
        String strReplaceFirst = this.nativePattern.matcher(charSequence).replaceFirst(str);
        Intrinsics.checkNotNullExpressionValue(strReplaceFirst, "");
        return strReplaceFirst;
    }

    public final List<String> IAuthTabCallback(@NotNull CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        StringsKt__StringsKt.requireNonNegativeLimit(i);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return CollectionsKt__CollectionsJVMKt.listOf(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(i > 0 ? RangesKt___RangesKt.coerceAtMost(i, 10) : 10);
        int i2 = i - 1;
        int iEnd = 0;
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i2 >= 0 && arrayList.size() == i2) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    public final Sequence<String> onWarmupCompleted(@NotNull CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        StringsKt__StringsKt.requireNonNegativeLimit(i);
        return clearSignalInfo.onNavigationEvent(new Regex$splitToSequence$1(this, charSequence, i, null));
    }

    public String toString() {
        String string = this.nativePattern.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final Pattern IAuthTabCallback() {
        return this.nativePattern;
    }

    private final Object writeReplace() {
        String strPattern = this.nativePattern.pattern();
        Intrinsics.checkNotNullExpressionValue(strPattern, "");
        return new Serialized(strPattern, this.nativePattern.flags());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int onExtraCallbackWithResult(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }

        private Companion() {
        }

        public final String IAuthTabCallback(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            String strQuote = Pattern.quote(str);
            Intrinsics.checkNotNullExpressionValue(strQuote, "");
            return strQuote;
        }
    }
}
