package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class gjd extends RuntimeException {
    private static final long serialVersionUID = 7906596804233893092L;
    private int preferedSize;

    public gjd(int i) {
        this.preferedSize = i;
    }

    public gjd() {
        this.preferedSize = 0;
    }

    public int onExtraCallback() {
        return this.preferedSize;
    }
}
