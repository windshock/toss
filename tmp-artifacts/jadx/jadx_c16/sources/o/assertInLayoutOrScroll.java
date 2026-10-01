package o;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public enum assertInLayoutOrScroll implements addOnScrollListener {
    CAMERA1(0),
    CAMERA2(1);

    private int value;
    static final assertInLayoutOrScroll DEFAULT = CAMERA1;

    assertInLayoutOrScroll(int i) {
        this.value = i;
    }

    int value() {
        return this.value;
    }

    static assertInLayoutOrScroll fromValue(int i) {
        for (assertInLayoutOrScroll assertinlayoutorscroll : values()) {
            if (assertinlayoutorscroll.value() == i) {
                return assertinlayoutorscroll;
            }
        }
        return DEFAULT;
    }
}
