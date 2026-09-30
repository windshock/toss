package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceUtil;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SingleSampleMediaPeriod$SourceLoadable implements Loader.Loadable {
    private final StatsDataSource dataSource;
    public final DataSpec dataSpec;
    public final long loadTaskId = LoadEventInfo.getNewId();
    private byte[] sampleData;

    public void cancelLoad() {
    }

    public SingleSampleMediaPeriod$SourceLoadable(DataSpec dataSpec, DataSource dataSource) {
        this.dataSpec = dataSpec;
        this.dataSource = new StatsDataSource(dataSource);
    }

    public void load() throws IOException {
        int bytesRead;
        StatsDataSource statsDataSource;
        byte[] bArr;
        this.dataSource.resetBytesRead();
        try {
            this.dataSource.open(this.dataSpec);
            do {
                bytesRead = (int) this.dataSource.getBytesRead();
                byte[] bArr2 = this.sampleData;
                if (bArr2 == null) {
                    this.sampleData = new byte[1024];
                } else if (bytesRead == bArr2.length) {
                    this.sampleData = Arrays.copyOf(bArr2, bArr2.length << 1);
                }
                statsDataSource = this.dataSource;
                bArr = this.sampleData;
            } while (statsDataSource.read(bArr, bytesRead, bArr.length - bytesRead) != -1);
        } finally {
            DataSourceUtil.closeQuietly(this.dataSource);
        }
    }
}
