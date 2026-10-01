package o;

import java.lang.Throwable;

@FunctionalInterface
/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface onUserEarnedRewardFail<R, E extends Throwable> {
    R onExtraCallback() throws Throwable;
}
