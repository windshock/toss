package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class getStringListFromAdObject {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final MatchResult IAuthTabCallback;
    private final r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY onExtraCallbackWithResult;

    public getStringListFromAdObject(@NotNull MatchResult matchResult, @NotNull r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY r8lambdarbv3rxsgnvgjhknxmwmoyzieky) {
        Intrinsics.checkNotNullParameter(matchResult, "");
        Intrinsics.checkNotNullParameter(r8lambdarbv3rxsgnvgjhknxmwmoyzieky, "");
        this.IAuthTabCallback = matchResult;
        this.onExtraCallbackWithResult = r8lambdarbv3rxsgnvgjhknxmwmoyzieky;
    }

    public final MatchResult onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        MatchResult matchResult = this.IAuthTabCallback;
        int i4 = i3 + 107;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return matchResult;
        }
        obj.hashCode();
        throw null;
    }

    public final r8lambdarBV3rxsgnVgJHKnXmwmoYziEkY onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
