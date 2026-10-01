package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class setHeartBeatListener implements dvycx<jc4> {
    setHeartBeatListener() {
    }

    @Override // o.dvycx
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void IAuthTabCallback(jc4 jc4Var, getJsObject getjsobject) {
        getjsobject.asInterface();
        getjsobject.onExtraCallbackWithResult("$undefined", true);
        getjsobject.onWarmupCompleted();
    }
}
