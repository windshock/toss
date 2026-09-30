package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.util.Collections;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface TsPayloadReader {
    public static final int FLAG_DATA_ALIGNMENT_INDICATOR = 4;
    public static final int FLAG_PAYLOAD_UNIT_START_INDICATOR = 1;
    public static final int FLAG_RANDOM_ACCESS_INDICATOR = 2;

    void consume(ParsableByteArray parsableByteArray, int i2) throws ParserException;

    void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TrackIdGenerator trackIdGenerator);

    void seek();

    public static final class EsInfo {
        public final byte[] descriptorBytes;
        public final List<DvbSubtitleInfo> dvbSubtitleInfos;
        public final String language;
        public final int streamType;

        public EsInfo(int i2, @Nullable String str, @Nullable List<DvbSubtitleInfo> list, byte[] bArr) {
            List<DvbSubtitleInfo> listUnmodifiableList;
            this.streamType = i2;
            this.language = str;
            if (list == null) {
                listUnmodifiableList = Collections.EMPTY_LIST;
            } else {
                listUnmodifiableList = Collections.unmodifiableList(list);
            }
            this.dvbSubtitleInfos = listUnmodifiableList;
            this.descriptorBytes = bArr;
        }
    }

    public static final class DvbSubtitleInfo {
        public final byte[] initializationData;
        public final String language;
        public final int type;

        public DvbSubtitleInfo(String str, int i2, byte[] bArr) {
            this.language = str;
            this.type = i2;
            this.initializationData = bArr;
        }
    }

    public static final class TrackIdGenerator {
        private static final int ID_UNSET = Integer.MIN_VALUE;
        private final int firstTrackId;
        private String formatId;
        private final String formatIdPrefix;
        private int trackId;
        private final int trackIdIncrement;

        public TrackIdGenerator(int i2, int i3) {
            this(ID_UNSET, i2, i3);
        }

        public TrackIdGenerator(int i2, int i3, int i4) {
            String str;
            if (i2 != ID_UNSET) {
                str = i2 + "/";
            } else {
                str = "";
            }
            this.formatIdPrefix = str;
            this.firstTrackId = i3;
            this.trackIdIncrement = i4;
            this.trackId = ID_UNSET;
            this.formatId = "";
        }

        public void generateNewId() {
            int i2 = this.trackId;
            this.trackId = i2 == ID_UNSET ? this.firstTrackId : i2 + this.trackIdIncrement;
            this.formatId = this.formatIdPrefix + this.trackId;
        }

        public int getTrackId() {
            maybeThrowUninitializedError();
            return this.trackId;
        }

        public String getFormatId() {
            maybeThrowUninitializedError();
            return this.formatId;
        }

        private void maybeThrowUninitializedError() {
            if (this.trackId == ID_UNSET) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }
}
