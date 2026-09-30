package o;

import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class sim extends ArrayList<rg> {
    private final int initialCapacity;
    private final int maxSize;

    sim(int i, int i2) {
        super(i);
        this.initialCapacity = i;
        this.maxSize = i2;
    }

    boolean onNavigationEvent() {
        return size() < this.maxSize;
    }

    int onExtraCallback() {
        return this.maxSize;
    }

    public static sim IAuthTabCallback() {
        return new sim(0, 0);
    }
}
