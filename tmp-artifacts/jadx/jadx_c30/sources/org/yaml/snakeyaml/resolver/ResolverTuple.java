package org.yaml.snakeyaml.resolver;

import java.util.regex.Pattern;
import o.getBSignPriKeyCCFBFH;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class ResolverTuple {
    private final int onExtraCallbackWithResult;
    private final Pattern onNavigationEvent;
    private final getBSignPriKeyCCFBFH onWarmupCompleted;

    public ResolverTuple(getBSignPriKeyCCFBFH getbsignprikeyccfbfh, Pattern pattern, int i) {
        this.onWarmupCompleted = getbsignprikeyccfbfh;
        this.onNavigationEvent = pattern;
        this.onExtraCallbackWithResult = i;
    }

    public getBSignPriKeyCCFBFH IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    public Pattern onExtraCallback() {
        return this.onNavigationEvent;
    }

    public int onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public String toString() {
        return "Tuple tag=" + this.onWarmupCompleted + " regexp=" + this.onNavigationEvent + " limit=" + this.onExtraCallbackWithResult;
    }
}
