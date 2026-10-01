package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class co {
    private final Map a = new HashMap();

    co() {
    }

    final double a(String str) {
        synchronized (this) {
            Double d = (Double) this.a.get(str);
            if (d == null) {
                return 0.0d;
            }
            return d.doubleValue();
        }
    }

    final double b(String str, dg dgVar) {
        double d;
        synchronized (this) {
            d = (((ce) dgVar).f + 1.0d) / ((ce) dgVar).g;
            this.a.put(str, Double.valueOf(d));
        }
        return d;
    }

    final void c(String str) {
        synchronized (this) {
            this.a.put(str, Double.valueOf(0.0d));
        }
    }
}
