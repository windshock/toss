package org.tensorflow.lite;

import java.io.Closeable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface Delegate extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
    }

    long getNativeHandle();
}
