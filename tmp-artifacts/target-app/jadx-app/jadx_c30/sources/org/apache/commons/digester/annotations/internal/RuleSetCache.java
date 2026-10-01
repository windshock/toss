package org.apache.commons.digester.annotations.internal;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import org.bouncycastle.pqc.crypto.rainbow.util.GF2Field;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RuleSetCache implements Serializable {
    private static final long serialVersionUID = 1;
    private final int capacity;
    private final Map<Class<?>, Object> data;
    private final int cacheSize = GF2Field.MASK;
    private final float loadFactor = 0.75f;

    public RuleSetCache() {
        int iCeil = ((int) Math.ceil(340.0d)) + 1;
        this.capacity = iCeil;
        this.data = new LinkedHashMap<Class<?>, Object>(iCeil, 0.75f) { // from class: org.apache.commons.digester.annotations.internal.RuleSetCache.1
            private static final long serialVersionUID = 1;

            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry<Class<?>, Object> entry) {
                return size() > 255;
            }
        };
    }
}
