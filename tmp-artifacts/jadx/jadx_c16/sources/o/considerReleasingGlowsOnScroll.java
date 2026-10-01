package o;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public enum considerReleasingGlowsOnScroll implements addOnScrollListener {
    DEVICE_DEFAULT(0),
    H_263(1),
    H_264(2);

    private int value;
    static final considerReleasingGlowsOnScroll DEFAULT = DEVICE_DEFAULT;

    considerReleasingGlowsOnScroll(int i) {
        this.value = i;
    }

    int value() {
        return this.value;
    }

    static considerReleasingGlowsOnScroll fromValue(int i) {
        for (considerReleasingGlowsOnScroll considerreleasingglowsonscroll : values()) {
            if (considerreleasingglowsonscroll.value() == i) {
                return considerreleasingglowsonscroll;
            }
        }
        return DEFAULT;
    }
}
