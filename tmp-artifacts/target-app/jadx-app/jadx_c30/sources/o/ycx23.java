package o;

import org.bson.types.Decimal128;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class ycx23 implements dvycx<Decimal128> {
    ycx23() {
    }

    @Override // o.dvycx
    public void IAuthTabCallback(Decimal128 decimal128, getJsObject getjsobject) {
        getjsobject.asInterface();
        getjsobject.onExtraCallbackWithResult("$numberDecimal");
        getjsobject.IAuthTabCallback(decimal128.toString());
        getjsobject.onWarmupCompleted();
    }
}
