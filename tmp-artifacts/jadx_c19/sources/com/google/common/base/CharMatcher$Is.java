package com.google.common.base;

import java.util.BitSet;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class CharMatcher$Is extends CharMatcher$FastMatcher {
    private final char match;

    CharMatcher$Is(char c) {
        this.match = c;
    }

    public boolean matches(char c) {
        return c == this.match;
    }

    public String replaceFrom(CharSequence charSequence, char c) {
        return charSequence.toString().replace(this.match, c);
    }

    public CharMatcher and(CharMatcher charMatcher) {
        return charMatcher.matches(this.match) ? this : CharMatcher.none();
    }

    public CharMatcher or(CharMatcher charMatcher) {
        return charMatcher.matches(this.match) ? charMatcher : super.or(charMatcher);
    }

    @Override // com.google.common.base.CharMatcher$FastMatcher
    public CharMatcher negate() {
        return CharMatcher.isNot(this.match);
    }

    void setBits(BitSet bitSet) {
        bitSet.set(this.match);
    }

    public String toString() {
        return "CharMatcher.is('" + CharMatcher.access$100(this.match) + "')";
    }
}
