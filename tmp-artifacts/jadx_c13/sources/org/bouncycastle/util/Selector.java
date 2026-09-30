package org.bouncycastle.util;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface Selector<T> extends Cloneable {
    Object clone();

    boolean match(T t);
}
