package org.bouncycastle.util;

import java.util.Collection;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface Store<T> {
    Collection<T> getMatches(Selector<T> selector) throws StoreException;
}
