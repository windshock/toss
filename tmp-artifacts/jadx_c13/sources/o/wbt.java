package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface wbt {

    public enum onExtraCallback {
        CONTINUE,
        SKIP_CHILDREN,
        SKIP_ENTIRELY,
        REMOVE,
        STOP
    }

    onExtraCallback onExtraCallback(qq qqVar, int i);

    onExtraCallback onExtraCallbackWithResult(qq qqVar, int i);
}
