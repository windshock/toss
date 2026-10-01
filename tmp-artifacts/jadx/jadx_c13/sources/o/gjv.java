package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class gjv extends Exception {
    private static final long serialVersionUID = 3731842424390998726L;
    private int closecode;

    public gjv(int i) {
        this.closecode = i;
    }

    public gjv(int i, String str) {
        super(str);
        this.closecode = i;
    }

    public gjv(int i, Throwable th) {
        super(th);
        this.closecode = i;
    }

    public int onExtraCallback() {
        return this.closecode;
    }
}
