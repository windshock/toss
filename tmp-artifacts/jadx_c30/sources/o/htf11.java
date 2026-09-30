package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class htf11 implements dvycx<Long> {
    htf11() {
    }

    @Override // o.dvycx
    public void IAuthTabCallback(Long l, getJsObject getjsobject) {
        getjsobject.asInterface();
        getjsobject.onNavigationEvent("$date", Long.toString(l.longValue()));
        getjsobject.onWarmupCompleted();
    }
}
