package o;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class setDislikeClickListener implements dvycx<p_> {
    private long onWarmupCompleted(int i) {
        return i & BodyPartID.bodyIdMax;
    }

    setDislikeClickListener() {
    }

    @Override // o.dvycx
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void IAuthTabCallback(p_ p_Var, getJsObject getjsobject) {
        getjsobject.asInterface();
        getjsobject.onWarmupCompleted("$timestamp");
        getjsobject.onNavigationEvent("t", dv8.onWarmupCompleted(onWarmupCompleted(p_Var.onExtraCallbackWithResult())));
        getjsobject.onNavigationEvent("i", dv8.onWarmupCompleted(onWarmupCompleted(p_Var.onNavigationEvent())));
        getjsobject.onWarmupCompleted();
        getjsobject.onWarmupCompleted();
    }
}
