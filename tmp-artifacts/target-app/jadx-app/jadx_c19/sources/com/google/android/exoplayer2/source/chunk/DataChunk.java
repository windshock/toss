package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceUtil;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class DataChunk extends Chunk {
    private static final int READ_GRANULARITY = 16384;
    private byte[] data;
    private volatile boolean loadCanceled;

    protected abstract void consume(byte[] bArr, int i2) throws IOException;

    public DataChunk(DataSource dataSource, DataSpec dataSpec, int i2, Format format, int i3, @Nullable Object obj, @Nullable byte[] bArr) {
        DataChunk dataChunk;
        byte[] bArr2;
        super(dataSource, dataSpec, i2, format, i3, obj, -9223372036854775807L, -9223372036854775807L);
        if (bArr == null) {
            bArr2 = Util.EMPTY_BYTE_ARRAY;
            dataChunk = this;
        } else {
            dataChunk = this;
            bArr2 = bArr;
        }
        dataChunk.data = bArr2;
    }

    public byte[] getDataHolder() {
        return this.data;
    }

    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    public final void load() throws IOException {
        try {
            ((Chunk) this).dataSource.open(((Chunk) this).dataSpec);
            int i2 = 0;
            int i3 = 0;
            while (i2 != -1 && !this.loadCanceled) {
                maybeExpandData(i3);
                i2 = ((Chunk) this).dataSource.read(this.data, i3, READ_GRANULARITY);
                if (i2 != -1) {
                    i3 += i2;
                }
            }
            if (!this.loadCanceled) {
                consume(this.data, i3);
            }
        } finally {
            DataSourceUtil.closeQuietly(((Chunk) this).dataSource);
        }
    }

    private void maybeExpandData(int i2) {
        byte[] bArr = this.data;
        if (bArr.length < i2 + READ_GRANULARITY) {
            this.data = Arrays.copyOf(bArr, bArr.length + READ_GRANULARITY);
        }
    }
}
