package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TRNAS_Password_GenOut extends TRANS_V2_Init {
    private final isBeforeFirst extendedRcode;

    public TRNAS_Password_GenOut() {
        this.extendedRcode = null;
    }

    public TRNAS_Password_GenOut(yzp2 yzp2Var, int i) {
        super(yzp2Var, i);
        this.extendedRcode = null;
    }

    public TRNAS_Password_GenOut(yzp2 yzp2Var, int i, isBeforeFirst isbeforefirst) {
        super("Lookup for " + yzp2Var + "/" + lt54.onNavigationEvent(i) + " failed with " + isbeforefirst.onNavigationEvent(), yzp2Var, i);
        this.extendedRcode = isbeforefirst;
    }
}
