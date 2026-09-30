package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.hls.HlsChunkSource;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceUtil;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class HlsMediaChunk extends MediaChunk {
    public static final String PRIV_TIMESTAMP_FRAME_OWNER = "com.apple.streaming.transportStreamTimestamp";
    private static final AtomicInteger uidSource = new AtomicInteger();
    public final int discontinuitySequenceNumber;
    private final DrmInitData drmInitData;
    private HlsMediaChunkExtractor extractor;
    private final HlsExtractorFactory extractorFactory;
    private boolean extractorInvalidated;
    private final boolean hasGapTag;
    private final Id3Decoder id3Decoder;
    private boolean initDataLoadRequired;
    private final DataSource initDataSource;
    private final DataSpec initDataSpec;
    private final boolean initSegmentEncrypted;
    private final boolean isMasterTimestampSource;
    private boolean isPublished;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private final boolean mediaSegmentEncrypted;
    private final List<Format> muxedCaptionFormats;
    private int nextLoadPosition;
    private HlsSampleStreamWrapper output;
    public final int partIndex;
    private final PlayerId playerId;
    public final Uri playlistUrl;
    private final HlsMediaChunkExtractor previousExtractor;
    private ImmutableList<Integer> sampleQueueFirstSampleIndices;
    private final ParsableByteArray scratchId3Data;
    public final boolean shouldSpliceIn;
    private final TimestampAdjuster timestampAdjuster;
    public final int uid;

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HlsMediaChunk createInstance(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, Format format, long j, HlsMediaPlaylist hlsMediaPlaylist, HlsChunkSource.SegmentBaseHolder segmentBaseHolder, Uri uri, @Nullable List<Format> list, int i2, @Nullable Object obj, boolean z, TimestampAdjusterProvider timestampAdjusterProvider, @Nullable HlsMediaChunk hlsMediaChunk, @Nullable byte[] bArr, @Nullable byte[] bArr2, boolean z2, PlayerId playerId) {
        boolean z3;
        DataSource dataSourceBuildDataSource;
        DataSpec dataSpec;
        boolean z4;
        DataSpec dataSpec2;
        Id3Decoder id3Decoder;
        ParsableByteArray parsableByteArray;
        HlsMediaChunkExtractor hlsMediaChunkExtractor;
        boolean z5;
        HlsMediaPlaylist.SegmentBase segmentBase = segmentBaseHolder.segmentBase;
        DataSpec dataSpecBuild = new DataSpec.Builder().setUri(UriUtil.resolveToUri(((HlsPlaylist) hlsMediaPlaylist).baseUri, segmentBase.url)).setPosition(segmentBase.byteRangeOffset).setLength(segmentBase.byteRangeLength).setFlags(segmentBaseHolder.isPreload ? 8 : 0).build();
        boolean z6 = bArr != null;
        DataSource dataSourceBuildDataSource2 = buildDataSource(dataSource, bArr, z6 ? getEncryptionIvArray((String) Assertions.checkNotNull(segmentBase.encryptionIV)) : null);
        HlsMediaPlaylist.Segment segment = segmentBase.initializationSegment;
        if (segment != null) {
            boolean z7 = bArr2 != null;
            byte[] encryptionIvArray = z7 ? getEncryptionIvArray((String) Assertions.checkNotNull(((HlsMediaPlaylist.SegmentBase) segment).encryptionIV)) : null;
            z3 = z6;
            dataSpec = new DataSpec(UriUtil.resolveToUri(((HlsPlaylist) hlsMediaPlaylist).baseUri, ((HlsMediaPlaylist.SegmentBase) segment).url), ((HlsMediaPlaylist.SegmentBase) segment).byteRangeOffset, ((HlsMediaPlaylist.SegmentBase) segment).byteRangeLength);
            dataSourceBuildDataSource = buildDataSource(dataSource, bArr2, encryptionIvArray);
            z4 = z7;
        } else {
            z3 = z6;
            dataSourceBuildDataSource = null;
            dataSpec = null;
            z4 = false;
        }
        long j2 = j + segmentBase.relativeStartTimeUs;
        long j3 = segmentBase.durationUs;
        int i3 = hlsMediaPlaylist.discontinuitySequence + segmentBase.relativeDiscontinuitySequence;
        if (hlsMediaChunk != null) {
            DataSpec dataSpec3 = hlsMediaChunk.initDataSpec;
            if (dataSpec != dataSpec3) {
                if (dataSpec == null || dataSpec3 == null || !dataSpec.uri.equals(dataSpec3.uri)) {
                    dataSpec2 = dataSpec;
                } else {
                    dataSpec2 = dataSpec;
                    if (dataSpec.position != hlsMediaChunk.initDataSpec.position) {
                    }
                    boolean z8 = uri.equals(hlsMediaChunk.playlistUrl) && hlsMediaChunk.loadCompleted;
                    id3Decoder = hlsMediaChunk.id3Decoder;
                    parsableByteArray = hlsMediaChunk.scratchId3Data;
                    hlsMediaChunkExtractor = (z5 || !z8 || hlsMediaChunk.extractorInvalidated || hlsMediaChunk.discontinuitySequenceNumber != i3) ? null : hlsMediaChunk.extractor;
                }
                z5 = false;
                if (uri.equals(hlsMediaChunk.playlistUrl)) {
                    if (z5) {
                        id3Decoder = hlsMediaChunk.id3Decoder;
                        parsableByteArray = hlsMediaChunk.scratchId3Data;
                        hlsMediaChunkExtractor = (z5 || !z8 || hlsMediaChunk.extractorInvalidated || hlsMediaChunk.discontinuitySequenceNumber != i3) ? null : hlsMediaChunk.extractor;
                    }
                }
            } else {
                dataSpec2 = dataSpec;
            }
            z5 = true;
            if (uri.equals(hlsMediaChunk.playlistUrl)) {
            }
        } else {
            dataSpec2 = dataSpec;
            id3Decoder = new Id3Decoder();
            parsableByteArray = new ParsableByteArray(10);
            hlsMediaChunkExtractor = null;
        }
        return new HlsMediaChunk(hlsExtractorFactory, dataSourceBuildDataSource2, dataSpecBuild, format, z3, dataSourceBuildDataSource, dataSpec2, z4, uri, list, i2, obj, j2, j2 + j3, segmentBaseHolder.mediaSequence, segmentBaseHolder.partIndex, !segmentBaseHolder.isPreload, i3, segmentBase.hasGapTag, z, timestampAdjusterProvider.getAdjuster(i3), segmentBase.drmInitData, hlsMediaChunkExtractor, id3Decoder, parsableByteArray, z2, playerId);
    }

    public static boolean shouldSpliceIn(@Nullable HlsMediaChunk hlsMediaChunk, Uri uri, HlsMediaPlaylist hlsMediaPlaylist, HlsChunkSource.SegmentBaseHolder segmentBaseHolder, long j) {
        if (hlsMediaChunk == null) {
            return false;
        }
        if (uri.equals(hlsMediaChunk.playlistUrl) && hlsMediaChunk.loadCompleted) {
            return false;
        }
        return !isIndependent(segmentBaseHolder, hlsMediaPlaylist) || j + segmentBaseHolder.segmentBase.relativeStartTimeUs < ((Chunk) hlsMediaChunk).endTimeUs;
    }

    private HlsMediaChunk(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, DataSpec dataSpec, Format format, boolean z, @Nullable DataSource dataSource2, @Nullable DataSpec dataSpec2, boolean z2, Uri uri, @Nullable List<Format> list, int i2, @Nullable Object obj, long j, long j2, long j3, int i3, boolean z3, int i4, boolean z4, boolean z5, TimestampAdjuster timestampAdjuster, @Nullable DrmInitData drmInitData, @Nullable HlsMediaChunkExtractor hlsMediaChunkExtractor, Id3Decoder id3Decoder, ParsableByteArray parsableByteArray, boolean z6, PlayerId playerId) {
        super(dataSource, dataSpec, format, i2, obj, j, j2, j3);
        this.mediaSegmentEncrypted = z;
        this.partIndex = i3;
        this.isPublished = z3;
        this.discontinuitySequenceNumber = i4;
        this.initDataSpec = dataSpec2;
        this.initDataSource = dataSource2;
        this.initDataLoadRequired = dataSpec2 != null;
        this.initSegmentEncrypted = z2;
        this.playlistUrl = uri;
        this.isMasterTimestampSource = z5;
        this.timestampAdjuster = timestampAdjuster;
        this.hasGapTag = z4;
        this.extractorFactory = hlsExtractorFactory;
        this.muxedCaptionFormats = list;
        this.drmInitData = drmInitData;
        this.previousExtractor = hlsMediaChunkExtractor;
        this.id3Decoder = id3Decoder;
        this.scratchId3Data = parsableByteArray;
        this.shouldSpliceIn = z6;
        this.playerId = playerId;
        this.sampleQueueFirstSampleIndices = ImmutableList.of();
        this.uid = uidSource.getAndIncrement();
    }

    public void init(HlsSampleStreamWrapper hlsSampleStreamWrapper, ImmutableList<Integer> immutableList) {
        this.output = hlsSampleStreamWrapper;
        this.sampleQueueFirstSampleIndices = immutableList;
    }

    public int getFirstSampleIndex(int i2) {
        Assertions.checkState(!this.shouldSpliceIn);
        if (i2 >= this.sampleQueueFirstSampleIndices.size()) {
            return 0;
        }
        return ((Integer) this.sampleQueueFirstSampleIndices.get(i2)).intValue();
    }

    public void invalidateExtractor() {
        this.extractorInvalidated = true;
    }

    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    public void cancelLoad() {
        this.loadCanceled = true;
    }

    public void load() throws IOException {
        HlsMediaChunkExtractor hlsMediaChunkExtractor;
        Assertions.checkNotNull(this.output);
        if (this.extractor == null && (hlsMediaChunkExtractor = this.previousExtractor) != null && hlsMediaChunkExtractor.isReusable()) {
            this.extractor = this.previousExtractor;
            this.initDataLoadRequired = false;
        }
        maybeLoadInitData();
        if (this.loadCanceled) {
            return;
        }
        if (!this.hasGapTag) {
            loadMedia();
        }
        this.loadCompleted = !this.loadCanceled;
    }

    public boolean isPublished() {
        return this.isPublished;
    }

    public void publish() {
        this.isPublished = true;
    }

    @RequiresNonNull
    private void maybeLoadInitData() throws IOException {
        if (this.initDataLoadRequired) {
            Assertions.checkNotNull(this.initDataSource);
            Assertions.checkNotNull(this.initDataSpec);
            feedDataToExtractor(this.initDataSource, this.initDataSpec, this.initSegmentEncrypted, false);
            this.nextLoadPosition = 0;
            this.initDataLoadRequired = false;
        }
    }

    @RequiresNonNull
    private void loadMedia() throws IOException {
        feedDataToExtractor(((Chunk) this).dataSource, ((Chunk) this).dataSpec, this.mediaSegmentEncrypted, true);
    }

    @RequiresNonNull
    private void feedDataToExtractor(DataSource dataSource, DataSpec dataSpec, boolean z, boolean z2) throws IOException {
        DataSpec dataSpecSubrange;
        if (z) {
            z = this.nextLoadPosition != 0;
            dataSpecSubrange = dataSpec;
        } else {
            dataSpecSubrange = dataSpec.subrange(this.nextLoadPosition);
        }
        try {
            DefaultExtractorInput defaultExtractorInputPrepareExtraction = prepareExtraction(dataSource, dataSpecSubrange, z2);
            if (z) {
                defaultExtractorInputPrepareExtraction.skipFully(this.nextLoadPosition);
            }
            while (!this.loadCanceled && this.extractor.read(defaultExtractorInputPrepareExtraction)) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((((Chunk) this).trackFormat.roleFlags & 16384) != 0) {
                            this.extractor.onTruncatedSegmentParsed();
                        } else {
                            throw e;
                        }
                    }
                } catch (Throwable th) {
                    this.nextLoadPosition = (int) (defaultExtractorInputPrepareExtraction.getPosition() - dataSpec.position);
                    throw th;
                }
            }
            this.nextLoadPosition = (int) (defaultExtractorInputPrepareExtraction.getPosition() - dataSpec.position);
        } finally {
            DataSourceUtil.closeQuietly(dataSource);
        }
    }

    @EnsuresNonNull
    @RequiresNonNull
    private DefaultExtractorInput prepareExtraction(DataSource dataSource, DataSpec dataSpec, boolean z) throws IOException {
        HlsMediaChunkExtractor hlsMediaChunkExtractorCreateExtractor;
        long jAdjustTsTimestamp;
        long jOpen = dataSource.open(dataSpec);
        if (z) {
            try {
                this.timestampAdjuster.sharedInitializeOrWait(this.isMasterTimestampSource, ((Chunk) this).startTimeUs);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataSource, dataSpec.position, jOpen);
        if (this.extractor == null) {
            long jPeekId3PrivTimestamp = peekId3PrivTimestamp(defaultExtractorInput);
            defaultExtractorInput.resetPeekPosition();
            HlsMediaChunkExtractor hlsMediaChunkExtractor = this.previousExtractor;
            if (hlsMediaChunkExtractor != null) {
                hlsMediaChunkExtractorCreateExtractor = hlsMediaChunkExtractor.recreate();
            } else {
                hlsMediaChunkExtractorCreateExtractor = this.extractorFactory.createExtractor(dataSpec.uri, ((Chunk) this).trackFormat, this.muxedCaptionFormats, this.timestampAdjuster, dataSource.getResponseHeaders(), defaultExtractorInput, this.playerId);
            }
            this.extractor = hlsMediaChunkExtractorCreateExtractor;
            if (hlsMediaChunkExtractorCreateExtractor.isPackedAudioExtractor()) {
                HlsSampleStreamWrapper hlsSampleStreamWrapper = this.output;
                if (jPeekId3PrivTimestamp != -9223372036854775807L) {
                    jAdjustTsTimestamp = this.timestampAdjuster.adjustTsTimestamp(jPeekId3PrivTimestamp);
                } else {
                    jAdjustTsTimestamp = ((Chunk) this).startTimeUs;
                }
                hlsSampleStreamWrapper.setSampleOffsetUs(jAdjustTsTimestamp);
            } else {
                this.output.setSampleOffsetUs(0L);
            }
            this.output.onNewExtractor();
            this.extractor.init(this.output);
        }
        this.output.setDrmInitData(this.drmInitData);
        return defaultExtractorInput;
    }

    private long peekId3PrivTimestamp(ExtractorInput extractorInput) throws IOException {
        extractorInput.resetPeekPosition();
        try {
            this.scratchId3Data.reset(10);
            extractorInput.peekFully(this.scratchId3Data.getData(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.scratchId3Data.readUnsignedInt24() != 4801587) {
            return -9223372036854775807L;
        }
        this.scratchId3Data.skipBytes(3);
        int synchSafeInt = this.scratchId3Data.readSynchSafeInt();
        int i2 = synchSafeInt + 10;
        if (i2 > this.scratchId3Data.capacity()) {
            byte[] data = this.scratchId3Data.getData();
            this.scratchId3Data.reset(i2);
            System.arraycopy(data, 0, this.scratchId3Data.getData(), 0, 10);
        }
        extractorInput.peekFully(this.scratchId3Data.getData(), 10, synchSafeInt);
        Metadata metadataDecode = this.id3Decoder.decode(this.scratchId3Data.getData(), synchSafeInt);
        if (metadataDecode == null) {
            return -9223372036854775807L;
        }
        int length = metadataDecode.length();
        for (int i3 = 0; i3 < length; i3++) {
            Metadata.Entry entry = metadataDecode.get(i3);
            if (entry instanceof PrivFrame) {
                PrivFrame privFrame = (PrivFrame) entry;
                if (PRIV_TIMESTAMP_FRAME_OWNER.equals(privFrame.owner)) {
                    System.arraycopy(privFrame.privateData, 0, this.scratchId3Data.getData(), 0, 8);
                    this.scratchId3Data.setPosition(0);
                    this.scratchId3Data.setLimit(8);
                    return this.scratchId3Data.readLong() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    private static byte[] getEncryptionIvArray(String str) {
        if (Ascii.toLowerCase(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static DataSource buildDataSource(DataSource dataSource, @Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            return dataSource;
        }
        Assertions.checkNotNull(bArr2);
        return new Aes128DataSource(dataSource, bArr, bArr2);
    }

    private static boolean isIndependent(HlsChunkSource.SegmentBaseHolder segmentBaseHolder, HlsMediaPlaylist hlsMediaPlaylist) {
        HlsMediaPlaylist.Part part = segmentBaseHolder.segmentBase;
        if (part instanceof HlsMediaPlaylist.Part) {
            if (part.isIndependent) {
                return true;
            }
            return segmentBaseHolder.partIndex == 0 && ((HlsPlaylist) hlsMediaPlaylist).hasIndependentSegments;
        }
        return ((HlsPlaylist) hlsMediaPlaylist).hasIndependentSegments;
    }
}
