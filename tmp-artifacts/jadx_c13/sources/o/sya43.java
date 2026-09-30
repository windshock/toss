package o;

import java.util.Optional;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class sya43 {
    private final Optional<sya8> onExtraCallback;
    private final Optional<sya8> onWarmupCompleted;

    public abstract IAuthTabCallback onNavigationEvent();

    public sya43(Optional<sya8> optional, Optional<sya8> optional2) {
        if ((optional.isPresent() && !optional2.isPresent()) || (!optional.isPresent() && optional2.isPresent())) {
            throw new NullPointerException("Both marks must be either present or absent.");
        }
        this.onWarmupCompleted = optional;
        this.onExtraCallback = optional2;
    }

    public sya43() {
        this(Optional.empty(), Optional.empty());
    }

    public Optional<sya8> asInterface() {
        return this.onWarmupCompleted;
    }

    public Optional<sya8> IAuthTabCallbackStub() {
        return this.onExtraCallback;
    }
}
