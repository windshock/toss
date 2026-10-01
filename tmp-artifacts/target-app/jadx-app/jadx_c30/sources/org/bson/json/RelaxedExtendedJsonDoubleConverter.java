package org.bson.json;

import o.dvycx;
import o.getJsObject;
import o.sya23;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class RelaxedExtendedJsonDoubleConverter implements dvycx<Double> {
    private static final dvycx<Double> onExtraCallbackWithResult = new sya23();

    @Override // o.dvycx
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void IAuthTabCallback(Double d, getJsObject getjsobject) {
        if (d.isNaN() || d.isInfinite()) {
            onExtraCallbackWithResult.IAuthTabCallback(d, getjsobject);
        } else {
            getjsobject.onExtraCallback(Double.toString(d.doubleValue()));
        }
    }
}
