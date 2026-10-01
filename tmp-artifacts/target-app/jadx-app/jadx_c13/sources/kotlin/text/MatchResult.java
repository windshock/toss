package kotlin.text;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import o.removeLogBuffers;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface MatchResult {
    removeLogBuffers IAuthTabCallback();

    Destructured getDestructured();

    List<String> getGroupValues();

    IntRange onExtraCallback();

    String onExtraCallbackWithResult();

    MatchResult onNavigationEvent();

    public static final class onExtraCallback {
        public static Destructured IAuthTabCallback(@NotNull MatchResult matchResult) {
            return new Destructured(matchResult);
        }
    }

    public static final class Destructured {
        private final MatchResult onExtraCallback;

        public Destructured(@NotNull MatchResult matchResult) {
            Intrinsics.checkNotNullParameter(matchResult, "");
            this.onExtraCallback = matchResult;
        }

        public final MatchResult getMatch() {
            return this.onExtraCallback;
        }
    }
}
