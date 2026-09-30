package org.snakeyaml.engine.v2.resolver;

import java.util.Objects;
import java.util.regex.Pattern;
import o.uh25;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ResolverTuple {
    private final uh25 onExtraCallbackWithResult;
    private final Pattern onNavigationEvent;

    public ResolverTuple(uh25 uh25Var, Pattern pattern) {
        Objects.requireNonNull(uh25Var);
        Objects.requireNonNull(pattern);
        this.onExtraCallbackWithResult = uh25Var;
        this.onNavigationEvent = pattern;
    }

    public uh25 onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    public Pattern onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public String toString() {
        return "Tuple tag=" + this.onExtraCallbackWithResult + " regexp=" + this.onNavigationEvent;
    }
}
