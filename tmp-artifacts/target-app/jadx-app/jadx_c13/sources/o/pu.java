package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class pu extends qgr {
    private final vd onExtraCallbackWithResult;

    public pu(sl slVar, String str, om omVar) {
        super(slVar, str, omVar);
        this.onExtraCallbackWithResult = new vd();
    }

    public pu onExtraCallback(qgr qgrVar) {
        this.onExtraCallbackWithResult.add(qgrVar);
        return this;
    }

    @Override // o.qq
    protected void asInterface(qq qqVar) {
        super.asInterface(qqVar);
        this.onExtraCallbackWithResult.remove(qqVar);
    }

    @Override // o.qgr, o.qq
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public pu clone() {
        return (pu) super.clone();
    }
}
