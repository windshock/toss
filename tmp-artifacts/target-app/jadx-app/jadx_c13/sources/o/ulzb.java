package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.ulzb;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ulzb<Output> implements setTextLocales<Output> {
    private final String onWarmupCompleted;

    public ulzb(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onWarmupCompleted = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Empty string is not allowed");
        }
        if (jw10.IAuthTabCallback(str.charAt(0))) {
            throw new IllegalArgumentException(("String '" + str + "' starts with a digit").toString());
        }
        if (jw10.IAuthTabCallback(str.charAt(str.length() - 1))) {
            throw new IllegalArgumentException(("String '" + str + "' ends with a digit").toString());
        }
    }

    @Override // o.setTextLocales
    public Object onExtraCallback(Output output, @NotNull final CharSequence charSequence, final int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (this.onWarmupCompleted.length() + i > charSequence.length()) {
            return fbyycx.Companion.IAuthTabCallback(i, new Function0() { // from class: kotlinx.datetime.internal.format.parser.PlainStringParserOperation$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ulzb.onExtraCallbackWithResult(this.f$0);
                }
            });
        }
        int length = this.onWarmupCompleted.length();
        for (final int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != this.onWarmupCompleted.charAt(i2)) {
                return fbyycx.Companion.IAuthTabCallback(i, new Function0() { // from class: kotlinx.datetime.internal.format.parser.PlainStringParserOperation$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ulzb.onExtraCallbackWithResult(this.f$0, charSequence, i, i2);
                    }
                });
            }
        }
        return fbyycx.Companion.onExtraCallbackWithResult(i + this.onWarmupCompleted.length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onExtraCallbackWithResult(ulzb ulzbVar) {
        return "Unexpected end of input: yet to parse '" + ulzbVar.onWarmupCompleted + '\'';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onExtraCallbackWithResult(ulzb ulzbVar, CharSequence charSequence, int i, int i2) {
        return "Expected " + ulzbVar.onWarmupCompleted + " but got " + charSequence.subSequence(i, i2 + i + 1).toString();
    }

    public String toString() {
        return '\'' + this.onWarmupCompleted + '\'';
    }
}
