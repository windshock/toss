package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class setShouldNotifyAdVisibility implements dvycx<String> {
    setShouldNotifyAdVisibility() {
    }

    @Override // o.dvycx
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void IAuthTabCallback(String str, getJsObject getjsobject) {
        getjsobject.asInterface();
        getjsobject.onWarmupCompleted("$symbol", str);
        getjsobject.onWarmupCompleted();
    }
}
