package o;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public enum animateAppearance implements addOnScrollListener {
    OFF(0),
    ON(1),
    AUTO(2),
    TORCH(3);

    private int value;
    static final animateAppearance DEFAULT = OFF;

    animateAppearance(int i) {
        this.value = i;
    }

    int value() {
        return this.value;
    }

    static animateAppearance fromValue(int i) {
        for (animateAppearance animateappearance : values()) {
            if (animateappearance.value() == i) {
                return animateappearance;
            }
        }
        return DEFAULT;
    }
}
