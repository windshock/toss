package o;

import java.util.Objects;
import java.util.Optional;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class sya44 extends sya43 {
    private final Optional<sya18> IAuthTabCallback;

    public sya44(Optional<sya18> optional, Optional<sya8> optional2, Optional<sya8> optional3) {
        super(optional2, optional3);
        Objects.requireNonNull(optional);
        this.IAuthTabCallback = optional;
    }

    public Optional<sya18> onTransact() {
        return this.IAuthTabCallback;
    }
}
