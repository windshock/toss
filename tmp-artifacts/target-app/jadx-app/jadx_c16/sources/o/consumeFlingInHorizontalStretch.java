package o;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public enum consumeFlingInHorizontalStretch implements addOnScrollListener {
    JPEG(0),
    DNG(1);

    private int value;
    static final consumeFlingInHorizontalStretch DEFAULT = JPEG;

    consumeFlingInHorizontalStretch(int i) {
        this.value = i;
    }

    int value() {
        return this.value;
    }

    static consumeFlingInHorizontalStretch fromValue(int i) {
        for (consumeFlingInHorizontalStretch consumeflinginhorizontalstretch : values()) {
            if (consumeflinginhorizontalstretch.value() == i) {
                return consumeflinginhorizontalstretch;
            }
        }
        return DEFAULT;
    }
}
