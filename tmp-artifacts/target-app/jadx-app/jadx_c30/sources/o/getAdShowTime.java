package o;

import org.bson.types.Decimal128;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class getAdShowTime implements dvycx<Decimal128> {
    getAdShowTime() {
    }

    @Override // o.dvycx
    public void IAuthTabCallback(Decimal128 decimal128, getJsObject getjsobject) {
        getjsobject.onNavigationEvent(String.format("NumberDecimal(\"%s\")", decimal128.toString()));
    }
}
