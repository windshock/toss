package com.initech.inibase.logger.helpers;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class NullEnumeration implements Enumeration {
    private static final NullEnumeration a = new NullEnumeration();

    private NullEnumeration() {
    }

    public static NullEnumeration getInstance() {
        return a;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return false;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        throw new NoSuchElementException();
    }
}
