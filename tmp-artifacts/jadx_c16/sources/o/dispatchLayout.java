package o;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public enum dispatchLayout implements addOnScrollListener {
    AUTO(0),
    INCANDESCENT(1),
    FLUORESCENT(2),
    DAYLIGHT(3),
    CLOUDY(4);

    private int value;
    static final dispatchLayout DEFAULT = AUTO;

    dispatchLayout(int i) {
        this.value = i;
    }

    int value() {
        return this.value;
    }

    static dispatchLayout fromValue(int i) {
        for (dispatchLayout dispatchlayout : values()) {
            if (dispatchlayout.value() == i) {
                return dispatchlayout;
            }
        }
        return DEFAULT;
    }
}
