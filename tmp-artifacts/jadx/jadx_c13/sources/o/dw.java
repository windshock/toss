package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface dw {

    public enum onExtraCallback {
        CLIENT,
        SERVER
    }

    public enum onWarmupCompleted {
        NOT_YET_CONNECTED,
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED
    }

    void sendFrame(hz hzVar);
}
