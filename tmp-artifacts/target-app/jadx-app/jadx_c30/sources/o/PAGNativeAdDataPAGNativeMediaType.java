package o;

import java.util.Collections;
import java.util.HashSet;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PAGNativeAdDataPAGNativeMediaType {
    @SafeVarargs
    public static <E> HashSet<E> onWarmupCompleted(E... eArr) {
        HashSet<E> hashSet = new HashSet<>(eArr.length);
        Collections.addAll(hashSet, eArr);
        return hashSet;
    }
}
