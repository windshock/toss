package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TRANS_V2_Init extends RuntimeException {
    private final boolean isAuthenticated;
    private final yzp2 name;
    private final int type;

    public TRANS_V2_Init() {
        this(null, null, null, 0, false);
    }

    public TRANS_V2_Init(String str) {
        this(str, null, null, 0, false);
    }

    TRANS_V2_Init(String str, Throwable th) {
        this(str, th, null, 0, false);
    }

    public TRANS_V2_Init(yzp2 yzp2Var, int i) {
        this("Lookup for " + yzp2Var + "/" + lt54.onNavigationEvent(i) + " failed", yzp2Var, i);
    }

    public TRANS_V2_Init(String str, yzp2 yzp2Var, int i) {
        this(str, null, yzp2Var, i, false);
    }

    TRANS_V2_Init(String str, Throwable th, yzp2 yzp2Var, int i, boolean z) {
        super(str, th);
        this.name = yzp2Var;
        this.type = i;
        this.isAuthenticated = z;
    }
}
