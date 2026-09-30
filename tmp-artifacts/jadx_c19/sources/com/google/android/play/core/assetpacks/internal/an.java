package com.google.android.play.core.assetpacks.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class an implements Closeable {
    public abstract long a();

    protected abstract InputStream b(long j, long j2) throws IOException;

    public final InputStream c() throws IOException {
        InputStream inputStreamB;
        synchronized (this) {
            inputStreamB = b(0L, a());
        }
        return inputStreamB;
    }
}
