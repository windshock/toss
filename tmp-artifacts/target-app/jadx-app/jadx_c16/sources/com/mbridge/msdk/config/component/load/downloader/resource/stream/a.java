package com.mbridge.msdk.config.component.load.downloader.resource.stream;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface a {
    void close() throws IOException;

    void flushAndSync() throws IOException;

    void seek(long j) throws IllegalAccessException, IOException;

    void write(byte[] bArr, int i, int i2) throws IOException;
}
