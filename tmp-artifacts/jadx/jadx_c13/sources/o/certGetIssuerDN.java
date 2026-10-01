package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class certGetIssuerDN implements certGetSerial {
    private final boolean onWarmupCompleted;

    public certGetIssuerDN(boolean z) {
        this.onWarmupCompleted = z;
    }

    public final boolean onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }
}
