package com.google.common.base;

import com.google.common.base.CharMatcher;

/* loaded from: /tmp/toss_alldex/classes19.dex */
abstract class CharMatcher$FastMatcher extends CharMatcher {
    public final CharMatcher precomputed() {
        return this;
    }

    CharMatcher$FastMatcher() {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ boolean apply(Object obj) {
        return super.apply((Character) obj);
    }

    public CharMatcher negate() {
        return new CharMatcher.NegatedFastMatcher(this);
    }
}
