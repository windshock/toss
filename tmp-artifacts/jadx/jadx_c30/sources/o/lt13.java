package o;

import java.util.Optional;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class lt13 {
    private final Optional<sya8> IAuthTabCallback;
    private final int IAuthTabCallbackDefault;
    private final boolean onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final int onWarmupCompleted;

    public lt13(int i, boolean z, int i2, int i3, int i4, Optional<sya8> optional) {
        this.IAuthTabCallbackDefault = i;
        this.onExtraCallback = z;
        this.onNavigationEvent = i2;
        this.onWarmupCompleted = i3;
        this.onExtraCallbackWithResult = i4;
        this.IAuthTabCallback = optional;
    }

    public int onNavigationEvent() {
        return this.IAuthTabCallbackDefault;
    }

    public int onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public Optional<sya8> onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public int onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public int IAuthTabCallback() {
        return this.onWarmupCompleted;
    }

    public boolean IAuthTabCallbackDefault() {
        return this.onExtraCallback;
    }

    public String toString() {
        return "SimpleKey - tokenNumber=" + this.IAuthTabCallbackDefault + " required=" + this.onExtraCallback + " index=" + this.onNavigationEvent + " line=" + this.onWarmupCompleted + " column=" + this.onExtraCallbackWithResult;
    }
}
