package o;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import o.ycx41;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class lud23<T> extends ycx41 {
    private final Optional<List<T>> IAuthTabCallback;
    private final String onWarmupCompleted;

    public lud23(String str, Optional<List<T>> optional, Optional<sya8> optional2, Optional<sya8> optional3) {
        super(optional2, optional3);
        Objects.requireNonNull(str);
        this.onWarmupCompleted = str;
        Objects.requireNonNull(optional);
        if (optional.isPresent() && optional.get().size() != 2) {
            throw new uh16("Two strings/integers must be provided instead of " + optional.get().size());
        }
        this.IAuthTabCallback = optional;
    }

    public String onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public Optional<List<T>> onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public ycx41.IAuthTabCallback onNavigationEvent() {
        return ycx41.IAuthTabCallback.Directive;
    }
}
