package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class setRefClickViews implements dvycx<Long> {
    setRefClickViews() {
    }

    @Override // o.dvycx
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void IAuthTabCallback(Long l, getJsObject getjsobject) {
        getjsobject.asInterface();
        getjsobject.onExtraCallbackWithResult("$numberLong");
        getjsobject.IAuthTabCallback(Long.toString(l.longValue()));
        getjsobject.onWarmupCompleted();
    }
}
