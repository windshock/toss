package o;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public enum clearOnScrollListeners implements addOnScrollListener {
    PICTURE(0),
    VIDEO(1);

    private int value;
    static final clearOnScrollListeners DEFAULT = PICTURE;

    clearOnScrollListeners(int i) {
        this.value = i;
    }

    int value() {
        return this.value;
    }

    static clearOnScrollListeners fromValue(int i) {
        for (clearOnScrollListeners clearonscrolllisteners : values()) {
            if (clearonscrolllisteners.value() == i) {
                return clearonscrolllisteners;
            }
        }
        return DEFAULT;
    }
}
