package org.apache.commons.compress.harmony.pack200;

import java.util.Comparator;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class BandSet$$ExternalSyntheticLambda1 implements Comparator {
    public final /* synthetic */ Map f$0;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Map map = this.f$0;
        return ((Integer) map.get((Integer) obj2)).compareTo((Integer) map.get((Integer) obj));
    }
}
