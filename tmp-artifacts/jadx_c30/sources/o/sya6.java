package o;

import java.util.Optional;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public enum sya6 {
    DOUBLE_QUOTED(Optional.of('\"')),
    SINGLE_QUOTED(Optional.of('\'')),
    LITERAL(Optional.of('|')),
    FOLDED(Optional.of('>')),
    JSON_SCALAR_STYLE(Optional.of('J')),
    PLAIN(Optional.empty());

    private final Optional<Character> styleOpt;

    sya6(Optional optional) {
        this.styleOpt = optional;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.styleOpt.orElse(':'));
    }
}
