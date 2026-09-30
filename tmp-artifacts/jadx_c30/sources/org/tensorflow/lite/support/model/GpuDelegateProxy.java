package org.tensorflow.lite.support.model;

import java.io.Closeable;
import java.io.IOException;
import org.tensorflow.lite.Delegate;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class GpuDelegateProxy implements Delegate, Closeable {
    private static final String TAG = "GpuDelegateProxy";
    private final Closeable proxiedCloseable;
    private final Delegate proxiedDelegate;

    public static GpuDelegateProxy maybeNewInstance() {
        try {
            return new GpuDelegateProxy(Class.forName("org.tensorflow.lite.gpu.GpuDelegate").getDeclaredConstructor(null).newInstance(null));
        } catch (ReflectiveOperationException unused) {
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.proxiedCloseable.close();
        } catch (IOException unused) {
        }
    }

    public long getNativeHandle() {
        return this.proxiedDelegate.getNativeHandle();
    }

    private GpuDelegateProxy(Object obj) {
        this.proxiedCloseable = (Closeable) obj;
        this.proxiedDelegate = (Delegate) obj;
    }
}
