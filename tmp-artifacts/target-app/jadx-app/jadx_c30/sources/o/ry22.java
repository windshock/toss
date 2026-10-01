package o;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class ry22 implements dvycx<Long> {
    ry22() {
    }

    @Override // o.dvycx
    public void IAuthTabCallback(Long l, getJsObject getjsobject) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        if (l.longValue() >= -59014396800000L && l.longValue() <= 253399536000000L) {
            getjsobject.onNavigationEvent(String.format("ISODate(\"%s\")", simpleDateFormat.format(new Date(l.longValue()))));
        } else {
            getjsobject.onNavigationEvent(String.format("new Date(%d)", l));
        }
    }
}
