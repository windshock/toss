package o;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public enum animateDisappearance implements addOnScrollListener {
    OFF(0),
    DRAW_3X3(1),
    DRAW_4X4(2),
    DRAW_PHI(3);

    private int value;
    static final animateDisappearance DEFAULT = OFF;

    animateDisappearance(int i) {
        this.value = i;
    }

    int value() {
        return this.value;
    }

    static animateDisappearance fromValue(int i) {
        for (animateDisappearance animatedisappearance : values()) {
            if (animatedisappearance.value() == i) {
                return animatedisappearance;
            }
        }
        return DEFAULT;
    }
}
