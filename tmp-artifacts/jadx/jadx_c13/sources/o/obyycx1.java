package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class obyycx1 extends Exception {
    private final int maxSize;

    obyycx1(int i) {
        super("Message size would exceed the allowed maximum of " + i + " bytes");
        this.maxSize = i;
    }
}
