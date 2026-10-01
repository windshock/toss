package com.google.common.base;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class CharMatcher$None extends CharMatcher$NamedFastMatcher {
    static final CharMatcher INSTANCE = new CharMatcher$None();

    public boolean matches(char c) {
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private CharMatcher$None() {
        final String str = "CharMatcher.none()";
        new CharMatcher$FastMatcher(str) { // from class: com.google.common.base.CharMatcher$NamedFastMatcher
            private final String description;

            {
                this.description = (String) Preconditions.checkNotNull(str);
            }

            public final String toString() {
                return this.description;
            }
        };
    }

    public int indexIn(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        return -1;
    }

    public int indexIn(CharSequence charSequence, int i2) {
        Preconditions.checkPositionIndex(i2, charSequence.length());
        return -1;
    }

    public int lastIndexIn(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        return -1;
    }

    public boolean matchesAllOf(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        return true;
    }

    public String removeFrom(CharSequence charSequence) {
        return charSequence.toString();
    }

    public String replaceFrom(CharSequence charSequence, char c) {
        return charSequence.toString();
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        Preconditions.checkNotNull(charSequence2);
        return charSequence.toString();
    }

    public String collapseFrom(CharSequence charSequence, char c) {
        return charSequence.toString();
    }

    public String trimFrom(CharSequence charSequence) {
        return charSequence.toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        return charSequence.toString();
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        return charSequence.toString();
    }

    public int countIn(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        return 0;
    }

    public CharMatcher and(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return this;
    }

    public CharMatcher or(CharMatcher charMatcher) {
        return (CharMatcher) Preconditions.checkNotNull(charMatcher);
    }

    @Override // com.google.common.base.CharMatcher$FastMatcher
    public CharMatcher negate() {
        return CharMatcher.any();
    }
}
