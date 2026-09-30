package o;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public enum clearOnChildAttachStateChangeListeners implements addOnScrollListener {
    OFF(0),
    ON(1);

    private int value;
    static final clearOnChildAttachStateChangeListeners DEFAULT = OFF;

    clearOnChildAttachStateChangeListeners(int i) {
        this.value = i;
    }

    int value() {
        return this.value;
    }

    static clearOnChildAttachStateChangeListeners fromValue(int i) {
        for (clearOnChildAttachStateChangeListeners clearonchildattachstatechangelisteners : values()) {
            if (clearonchildattachstatechangelisteners.value() == i) {
                return clearonchildattachstatechangelisteners;
            }
        }
        return DEFAULT;
    }
}
