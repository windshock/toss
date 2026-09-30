package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class sya23 implements dvycx<Double> {
    @Override // o.dvycx
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void IAuthTabCallback(Double d, getJsObject getjsobject) {
        getjsobject.asInterface();
        getjsobject.onExtraCallbackWithResult("$numberDouble");
        getjsobject.IAuthTabCallback(Double.toString(d.doubleValue()));
        getjsobject.onWarmupCompleted();
    }
}
