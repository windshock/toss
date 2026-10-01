package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class sya22 implements dvycx<Integer> {
    sya22() {
    }

    @Override // o.dvycx
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void IAuthTabCallback(Integer num, getJsObject getjsobject) {
        getjsobject.asInterface();
        getjsobject.onExtraCallbackWithResult("$numberInt");
        getjsobject.IAuthTabCallback(Integer.toString(num.intValue()));
        getjsobject.onWarmupCompleted();
    }
}
