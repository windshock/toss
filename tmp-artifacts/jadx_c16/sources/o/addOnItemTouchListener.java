package o;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public enum addOnItemTouchListener implements addOnScrollListener {
    DEVICE_DEFAULT(0),
    AAC(1),
    HE_AAC(2),
    AAC_ELD(3);

    private int value;
    static final addOnItemTouchListener DEFAULT = DEVICE_DEFAULT;

    addOnItemTouchListener(int i) {
        this.value = i;
    }

    int value() {
        return this.value;
    }

    static addOnItemTouchListener fromValue(int i) {
        for (addOnItemTouchListener addonitemtouchlistener : values()) {
            if (addonitemtouchlistener.value() == i) {
                return addonitemtouchlistener;
            }
        }
        return DEFAULT;
    }
}
