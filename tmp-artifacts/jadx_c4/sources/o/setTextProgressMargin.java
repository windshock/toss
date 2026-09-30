package o;

import java.io.Closeable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface setTextProgressMargin<T> extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void onExtraCallback();

    T onWarmupCompleted();
}
