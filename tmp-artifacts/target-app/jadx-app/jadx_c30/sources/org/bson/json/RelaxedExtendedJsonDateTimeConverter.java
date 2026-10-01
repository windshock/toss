package org.bson.json;

import o.dv84;
import o.dvycx;
import o.getJsObject;
import o.ycx22;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RelaxedExtendedJsonDateTimeConverter implements dvycx<Long> {
    private static final dvycx<Long> IAuthTabCallback = new ycx22();

    @Override // o.dvycx
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void IAuthTabCallback(Long l, getJsObject getjsobject) {
        if (l.longValue() < 0 || l.longValue() > 253402300799999L) {
            IAuthTabCallback.IAuthTabCallback(l, getjsobject);
            return;
        }
        getjsobject.asInterface();
        getjsobject.onWarmupCompleted("$date", dv84.onExtraCallbackWithResult(l.longValue()));
        getjsobject.onWarmupCompleted();
    }
}
