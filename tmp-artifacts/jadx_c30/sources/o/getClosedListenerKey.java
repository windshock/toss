package o;

import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class getClosedListenerKey implements dvycx<ea41> {
    getClosedListenerKey() {
    }

    @Override // o.dvycx
    public void IAuthTabCallback(ea41 ea41Var, getJsObject getjsobject) {
        getjsobject.onNavigationEvent("/" + (ea41Var.onNavigationEvent().equals(BuildConfig.FLAVOR) ? "(?:)" : ea41Var.onNavigationEvent().replace("/", "\\/")) + "/" + ea41Var.onWarmupCompleted());
    }
}
