package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UST_TRANS_VeriSign_ImportCert {
    private final boolean IAuthTabCallback;
    private final String asInterface;
    private final boolean onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final boolean onTransact;
    private final boolean onWarmupCompleted;

    public UST_TRANS_VeriSign_ImportCert(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.asInterface = str;
        this.IAuthTabCallback = z;
        this.onTransact = z2;
        this.onWarmupCompleted = z3;
        this.onExtraCallbackWithResult = z4;
        this.onExtraCallback = z5;
        this.onNavigationEvent = z6;
    }

    public String onExtraCallbackWithResult() {
        return this.asInterface;
    }

    public boolean asInterface() {
        return this.IAuthTabCallback;
    }

    public boolean IAuthTabCallbackDefault() {
        return this.onTransact;
    }

    public boolean onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public boolean onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public boolean onWarmupCompleted() {
        return this.onExtraCallback;
    }

    public boolean IAuthTabCallback() {
        return this.onNavigationEvent;
    }
}
