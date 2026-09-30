package o;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class uh2 {
    protected boolean IAuthTabCallback;
    private Map<String, Object> IAuthTabCallbackDefault;
    private List<sya15> IAuthTabCallbackStub;
    private boolean asBinder;
    private uh25 asInterface;
    private List<sya15> onExtraCallback;
    private List<sya15> onExtraCallbackWithResult;
    protected Optional<sya8> onNavigationEvent;
    private final Optional<sya8> onTransact;
    private Optional<sya18> onWarmupCompleted;

    public abstract uh22 onExtraCallbackWithResult();

    public uh2(uh25 uh25Var, Optional<sya8> optional, Optional<sya8> optional2) {
        onWarmupCompleted(uh25Var);
        this.onTransact = optional;
        this.onNavigationEvent = optional2;
        this.asBinder = false;
        this.IAuthTabCallback = true;
        this.onWarmupCompleted = Optional.empty();
        this.IAuthTabCallbackStub = null;
        this.onExtraCallback = null;
        this.onExtraCallbackWithResult = null;
        this.IAuthTabCallbackDefault = null;
    }

    public uh25 onExtraCallback() {
        return this.asInterface;
    }

    public void onWarmupCompleted(uh25 uh25Var) {
        Objects.requireNonNull(uh25Var, "tag in a Node is required.");
        this.asInterface = uh25Var;
    }

    public Optional<sya8> IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public Optional<sya8> onNavigationEvent() {
        return this.onTransact;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean IAuthTabCallbackDefault() {
        return this.asBinder;
    }

    public void onExtraCallbackWithResult(boolean z) {
        this.asBinder = z;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void onExtraCallbackWithResult(Optional<sya18> optional) {
        this.onWarmupCompleted = optional;
    }

    public void onExtraCallbackWithResult(List<sya15> list) {
        this.IAuthTabCallbackStub = list;
    }

    public void IAuthTabCallback(List<sya15> list) {
        this.onExtraCallback = list;
    }

    public void onWarmupCompleted(List<sya15> list) {
        this.onExtraCallbackWithResult = list;
    }
}
