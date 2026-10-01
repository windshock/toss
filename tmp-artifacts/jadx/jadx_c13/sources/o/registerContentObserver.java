package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class registerContentObserver extends isLast {
    private byte[] data;

    registerContentObserver(int i) {
        super(i);
    }

    @Override // o.isLast
    void onWarmupCompleted(getBlob getblob) {
        this.data = getblob.onExtraCallback();
    }

    @Override // o.isLast
    void onNavigationEvent(deactivate deactivateVar) {
        deactivateVar.onNavigationEvent(this.data);
    }

    @Override // o.isLast
    String onWarmupCompleted() {
        return "<" + TRANS_V2_SendReceiverInfo.onExtraCallback(this.data) + ">";
    }
}
