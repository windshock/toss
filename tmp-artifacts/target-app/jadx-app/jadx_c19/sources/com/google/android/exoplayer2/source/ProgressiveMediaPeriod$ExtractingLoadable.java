package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.IcyDataSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceUtil;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ProgressiveMediaPeriod$ExtractingLoadable implements Loader.Loadable, IcyDataSource.Listener {
    private final StatsDataSource dataSource;
    private final ExtractorOutput extractorOutput;
    private TrackOutput icyTrackOutput;
    private volatile boolean loadCanceled;
    private final ConditionVariable loadCondition;
    private final ProgressiveMediaExtractor progressiveMediaExtractor;
    private long seekTimeUs;
    private boolean seenIcyMetadata;
    final /* synthetic */ ProgressiveMediaPeriod this$0;
    private final Uri uri;
    private final PositionHolder positionHolder = new PositionHolder();
    private boolean pendingExtractorSeek = true;
    private final long loadTaskId = LoadEventInfo.getNewId();
    private DataSpec dataSpec = buildDataSpec(0);

    public ProgressiveMediaPeriod$ExtractingLoadable(ProgressiveMediaPeriod progressiveMediaPeriod, Uri uri, DataSource dataSource, ProgressiveMediaExtractor progressiveMediaExtractor, ExtractorOutput extractorOutput, ConditionVariable conditionVariable) {
        this.this$0 = progressiveMediaPeriod;
        this.uri = uri;
        this.dataSource = new StatsDataSource(dataSource);
        this.progressiveMediaExtractor = progressiveMediaExtractor;
        this.extractorOutput = extractorOutput;
        this.loadCondition = conditionVariable;
    }

    public void cancelLoad() {
        this.loadCanceled = true;
    }

    public void load() throws IOException {
        int i2 = 0;
        while (i2 == 0 && !this.loadCanceled) {
            try {
                long j = this.positionHolder.position;
                DataSpec dataSpecBuildDataSpec = buildDataSpec(j);
                this.dataSpec = dataSpecBuildDataSpec;
                long jOpen = this.dataSource.open(dataSpecBuildDataSpec);
                if (jOpen != -1) {
                    jOpen += j;
                    ProgressiveMediaPeriod.access$600(this.this$0);
                }
                long j2 = jOpen;
                ProgressiveMediaPeriod.access$702(this.this$0, IcyHeaders.parse(this.dataSource.getResponseHeaders()));
                IcyDataSource icyDataSource = this.dataSource;
                if (ProgressiveMediaPeriod.access$700(this.this$0) != null && ProgressiveMediaPeriod.access$700(this.this$0).metadataInterval != -1) {
                    icyDataSource = new IcyDataSource(this.dataSource, ProgressiveMediaPeriod.access$700(this.this$0).metadataInterval, this);
                    TrackOutput trackOutputIcyTrack = this.this$0.icyTrack();
                    this.icyTrackOutput = trackOutputIcyTrack;
                    trackOutputIcyTrack.format(ProgressiveMediaPeriod.access$800());
                }
                long currentInputPosition = j;
                this.progressiveMediaExtractor.init(icyDataSource, this.uri, this.dataSource.getResponseHeaders(), j, j2, this.extractorOutput);
                if (ProgressiveMediaPeriod.access$700(this.this$0) != null) {
                    this.progressiveMediaExtractor.disableSeekingOnMp3Streams();
                }
                if (this.pendingExtractorSeek) {
                    this.progressiveMediaExtractor.seek(currentInputPosition, this.seekTimeUs);
                    this.pendingExtractorSeek = false;
                }
                while (true) {
                    long j3 = currentInputPosition;
                    while (i2 == 0 && !this.loadCanceled) {
                        try {
                            this.loadCondition.block();
                            i2 = this.progressiveMediaExtractor.read(this.positionHolder);
                            currentInputPosition = this.progressiveMediaExtractor.getCurrentInputPosition();
                            if (currentInputPosition > ProgressiveMediaPeriod.access$900(this.this$0) + j3) {
                                break;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    this.loadCondition.close();
                    ProgressiveMediaPeriod.access$1100(this.this$0).post(ProgressiveMediaPeriod.access$1000(this.this$0));
                }
                if (i2 == 1) {
                    i2 = 0;
                } else if (this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                    this.positionHolder.position = this.progressiveMediaExtractor.getCurrentInputPosition();
                }
                DataSourceUtil.closeQuietly(this.dataSource);
            } catch (Throwable th) {
                if (i2 != 1 && this.progressiveMediaExtractor.getCurrentInputPosition() != -1) {
                    this.positionHolder.position = this.progressiveMediaExtractor.getCurrentInputPosition();
                }
                DataSourceUtil.closeQuietly(this.dataSource);
                throw th;
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.IcyDataSource.Listener
    public void onIcyMetadata(ParsableByteArray parsableByteArray) {
        long jMax;
        if (!this.seenIcyMetadata) {
            jMax = this.seekTimeUs;
        } else {
            jMax = Math.max(ProgressiveMediaPeriod.access$1200(this.this$0, true), this.seekTimeUs);
        }
        int iBytesLeft = parsableByteArray.bytesLeft();
        TrackOutput trackOutput = (TrackOutput) Assertions.checkNotNull(this.icyTrackOutput);
        trackOutput.sampleData(parsableByteArray, iBytesLeft);
        trackOutput.sampleMetadata(jMax, 1, iBytesLeft, 0, (TrackOutput.CryptoData) null);
        this.seenIcyMetadata = true;
    }

    private DataSpec buildDataSpec(long j) {
        return new DataSpec.Builder().setUri(this.uri).setPosition(j).setKey(ProgressiveMediaPeriod.access$1400(this.this$0)).setFlags(6).setHttpRequestHeaders(ProgressiveMediaPeriod.access$1300()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoadPosition(long j, long j2) {
        this.positionHolder.position = j;
        this.seekTimeUs = j2;
        this.pendingExtractorSeek = true;
        this.seenIcyMetadata = false;
    }
}
