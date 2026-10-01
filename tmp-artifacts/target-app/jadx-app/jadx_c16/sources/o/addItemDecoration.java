package o;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public enum addItemDecoration implements addOnScrollListener {
    OFF(0),
    ON(1),
    MONO(2),
    STEREO(3);

    private int value;
    static final addItemDecoration DEFAULT = ON;

    addItemDecoration(int i) {
        this.value = i;
    }

    int value() {
        return this.value;
    }

    static addItemDecoration fromValue(int i) {
        for (addItemDecoration additemdecoration : values()) {
            if (additemdecoration.value() == i) {
                return additemdecoration;
            }
        }
        return DEFAULT;
    }
}
