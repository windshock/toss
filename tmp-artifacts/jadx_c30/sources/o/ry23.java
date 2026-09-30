package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class ry23 implements dvycx<Long> {
    ry23() {
    }

    @Override // o.dvycx
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void IAuthTabCallback(Long l, getJsObject getjsobject) {
        if (l.longValue() >= -2147483648L && l.longValue() <= 2147483647L) {
            getjsobject.onNavigationEvent(String.format("NumberLong(%d)", l));
        } else {
            getjsobject.onNavigationEvent(String.format("NumberLong(\"%d\")", l));
        }
    }
}
