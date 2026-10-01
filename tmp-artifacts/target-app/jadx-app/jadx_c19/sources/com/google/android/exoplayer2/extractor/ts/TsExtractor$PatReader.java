package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class TsExtractor$PatReader implements SectionPayloadReader {
    private final ParsableBitArray patScratch = new ParsableBitArray(new byte[4]);
    final /* synthetic */ TsExtractor this$0;

    @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
    public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
    }

    public TsExtractor$PatReader(TsExtractor tsExtractor) {
        this.this$0 = tsExtractor;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
    public void consume(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.readUnsignedByte() != 0 || (parsableByteArray.readUnsignedByte() & 128) == 0) {
            return;
        }
        parsableByteArray.skipBytes(6);
        int iBytesLeft = parsableByteArray.bytesLeft() / 4;
        for (int i2 = 0; i2 < iBytesLeft; i2++) {
            parsableByteArray.readBytes(this.patScratch, 4);
            int bits = this.patScratch.readBits(16);
            this.patScratch.skipBits(3);
            if (bits == 0) {
                this.patScratch.skipBits(13);
            } else {
                final int bits2 = this.patScratch.readBits(13);
                if (TsExtractor.access$000(this.this$0).get(bits2) == null) {
                    SparseArray sparseArrayAccess$000 = TsExtractor.access$000(this.this$0);
                    final TsExtractor tsExtractor = this.this$0;
                    sparseArrayAccess$000.put(bits2, new SectionReader(new SectionPayloadReader(tsExtractor, bits2) { // from class: com.google.android.exoplayer2.extractor.ts.TsExtractor$PmtReader
                        private static final int TS_PMT_DESC_AC3 = 106;
                        private static final int TS_PMT_DESC_AIT = 111;
                        private static final int TS_PMT_DESC_DTS = 123;
                        private static final int TS_PMT_DESC_DVBSUBS = 89;
                        private static final int TS_PMT_DESC_DVB_EXT = 127;
                        private static final int TS_PMT_DESC_DVB_EXT_AC4 = 21;
                        private static final int TS_PMT_DESC_EAC3 = 122;
                        private static final int TS_PMT_DESC_ISO639_LANG = 10;
                        private static final int TS_PMT_DESC_REGISTRATION = 5;
                        private final int pid;
                        final /* synthetic */ TsExtractor this$0;
                        private final ParsableBitArray pmtScratch = new ParsableBitArray(new byte[5]);
                        private final SparseArray<TsPayloadReader> trackIdToReaderScratch = new SparseArray<>();
                        private final SparseIntArray trackIdToPidScratch = new SparseIntArray();

                        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
                        public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
                        }

                        {
                            this.pid = bits2;
                        }

                        @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
                        public void consume(ParsableByteArray parsableByteArray2) {
                            TimestampAdjuster timestampAdjuster;
                            TsPayloadReader tsPayloadReaderCreatePayloadReader;
                            if (parsableByteArray2.readUnsignedByte() == 2) {
                                if (TsExtractor.access$200(this.this$0) == 1 || TsExtractor.access$200(this.this$0) == 2 || TsExtractor.access$100(this.this$0) == 1) {
                                    timestampAdjuster = (TimestampAdjuster) TsExtractor.access$300(this.this$0).get(0);
                                } else {
                                    timestampAdjuster = new TimestampAdjuster(((TimestampAdjuster) TsExtractor.access$300(this.this$0).get(0)).getFirstSampleTimestampUs());
                                    TsExtractor.access$300(this.this$0).add(timestampAdjuster);
                                }
                                if ((parsableByteArray2.readUnsignedByte() & 128) != 0) {
                                    parsableByteArray2.skipBytes(1);
                                    int unsignedShort = parsableByteArray2.readUnsignedShort();
                                    int i3 = 3;
                                    parsableByteArray2.skipBytes(3);
                                    parsableByteArray2.readBytes(this.pmtScratch, 2);
                                    this.pmtScratch.skipBits(3);
                                    int i4 = 13;
                                    TsExtractor.access$402(this.this$0, this.pmtScratch.readBits(13));
                                    parsableByteArray2.readBytes(this.pmtScratch, 2);
                                    int i5 = 4;
                                    this.pmtScratch.skipBits(4);
                                    parsableByteArray2.skipBytes(this.pmtScratch.readBits(12));
                                    if (TsExtractor.access$200(this.this$0) == 2 && TsExtractor.access$500(this.this$0) == null) {
                                        TsPayloadReader.EsInfo esInfo = new TsPayloadReader.EsInfo(TS_PMT_DESC_DVB_EXT_AC4, null, null, Util.EMPTY_BYTE_ARRAY);
                                        TsExtractor tsExtractor2 = this.this$0;
                                        TsExtractor.access$502(tsExtractor2, TsExtractor.access$600(tsExtractor2).createPayloadReader(TS_PMT_DESC_DVB_EXT_AC4, esInfo));
                                        if (TsExtractor.access$500(this.this$0) != null) {
                                            TsExtractor.access$500(this.this$0).init(timestampAdjuster, TsExtractor.access$700(this.this$0), new TsPayloadReader.TrackIdGenerator(unsignedShort, TS_PMT_DESC_DVB_EXT_AC4, 8192));
                                        }
                                    }
                                    this.trackIdToReaderScratch.clear();
                                    this.trackIdToPidScratch.clear();
                                    int iBytesLeft2 = parsableByteArray2.bytesLeft();
                                    while (iBytesLeft2 > 0) {
                                        parsableByteArray2.readBytes(this.pmtScratch, 5);
                                        int bits3 = this.pmtScratch.readBits(8);
                                        this.pmtScratch.skipBits(i3);
                                        int bits4 = this.pmtScratch.readBits(i4);
                                        this.pmtScratch.skipBits(i5);
                                        int bits5 = this.pmtScratch.readBits(12);
                                        TsPayloadReader.EsInfo esInfo2 = readEsInfo(parsableByteArray2, bits5);
                                        if (bits3 == 6 || bits3 == 5) {
                                            bits3 = esInfo2.streamType;
                                        }
                                        iBytesLeft2 -= bits5 + 5;
                                        int i6 = TsExtractor.access$200(this.this$0) == 2 ? bits3 : bits4;
                                        if (!TsExtractor.access$800(this.this$0).get(i6)) {
                                            if (TsExtractor.access$200(this.this$0) == 2 && bits3 == TS_PMT_DESC_DVB_EXT_AC4) {
                                                tsPayloadReaderCreatePayloadReader = TsExtractor.access$500(this.this$0);
                                            } else {
                                                tsPayloadReaderCreatePayloadReader = TsExtractor.access$600(this.this$0).createPayloadReader(bits3, esInfo2);
                                            }
                                            if (TsExtractor.access$200(this.this$0) != 2 || bits4 < this.trackIdToPidScratch.get(i6, 8192)) {
                                                this.trackIdToPidScratch.put(i6, bits4);
                                                this.trackIdToReaderScratch.put(i6, tsPayloadReaderCreatePayloadReader);
                                            }
                                        }
                                        i3 = 3;
                                        i5 = 4;
                                        i4 = 13;
                                    }
                                    int size = this.trackIdToPidScratch.size();
                                    for (int i7 = 0; i7 < size; i7++) {
                                        int iKeyAt = this.trackIdToPidScratch.keyAt(i7);
                                        int iValueAt = this.trackIdToPidScratch.valueAt(i7);
                                        TsExtractor.access$800(this.this$0).put(iKeyAt, true);
                                        TsExtractor.access$900(this.this$0).put(iValueAt, true);
                                        TsPayloadReader tsPayloadReaderValueAt = this.trackIdToReaderScratch.valueAt(i7);
                                        if (tsPayloadReaderValueAt != null) {
                                            if (tsPayloadReaderValueAt != TsExtractor.access$500(this.this$0)) {
                                                tsPayloadReaderValueAt.init(timestampAdjuster, TsExtractor.access$700(this.this$0), new TsPayloadReader.TrackIdGenerator(unsignedShort, iKeyAt, 8192));
                                            }
                                            TsExtractor.access$000(this.this$0).put(iValueAt, tsPayloadReaderValueAt);
                                        }
                                    }
                                    if (TsExtractor.access$200(this.this$0) == 2) {
                                        if (TsExtractor.access$1000(this.this$0)) {
                                            return;
                                        }
                                        TsExtractor.access$700(this.this$0).endTracks();
                                        TsExtractor.access$102(this.this$0, 0);
                                        TsExtractor.access$1002(this.this$0, true);
                                        return;
                                    }
                                    TsExtractor.access$000(this.this$0).remove(this.pid);
                                    TsExtractor tsExtractor3 = this.this$0;
                                    TsExtractor.access$102(tsExtractor3, TsExtractor.access$200(tsExtractor3) == 1 ? 0 : TsExtractor.access$100(this.this$0) - 1);
                                    if (TsExtractor.access$100(this.this$0) == 0) {
                                        TsExtractor.access$700(this.this$0).endTracks();
                                        TsExtractor.access$1002(this.this$0, true);
                                    }
                                }
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
                        /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
                        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        private TsPayloadReader.EsInfo readEsInfo(ParsableByteArray parsableByteArray2, int i3) {
                            int position = parsableByteArray2.getPosition();
                            int i4 = i3 + position;
                            int i5 = -1;
                            String strTrim = null;
                            ArrayList arrayList = null;
                            while (parsableByteArray2.getPosition() < i4) {
                                int unsignedByte = parsableByteArray2.readUnsignedByte();
                                int position2 = parsableByteArray2.getPosition() + parsableByteArray2.readUnsignedByte();
                                if (position2 > i4) {
                                    break;
                                }
                                if (unsignedByte == 5) {
                                    long unsignedInt = parsableByteArray2.readUnsignedInt();
                                    if (unsignedInt == 1094921523) {
                                        i5 = 129;
                                    } else if (unsignedInt == 1161904947) {
                                        i5 = 135;
                                    } else if (unsignedInt == 1094921524) {
                                        i5 = 172;
                                    } else if (unsignedInt == 1212503619) {
                                        i5 = 36;
                                    }
                                } else if (unsignedByte != TS_PMT_DESC_AC3) {
                                    if (unsignedByte != TS_PMT_DESC_EAC3) {
                                        if (unsignedByte == TS_PMT_DESC_DVB_EXT) {
                                            if (parsableByteArray2.readUnsignedByte() == TS_PMT_DESC_DVB_EXT_AC4) {
                                            }
                                        } else if (unsignedByte == TS_PMT_DESC_DTS) {
                                            i5 = 138;
                                        } else if (unsignedByte == 10) {
                                            strTrim = parsableByteArray2.readString(3).trim();
                                        } else if (unsignedByte == TS_PMT_DESC_DVBSUBS) {
                                            ArrayList arrayList2 = new ArrayList();
                                            while (parsableByteArray2.getPosition() < position2) {
                                                String strTrim2 = parsableByteArray2.readString(3).trim();
                                                int unsignedByte2 = parsableByteArray2.readUnsignedByte();
                                                byte[] bArr = new byte[4];
                                                parsableByteArray2.readBytes(bArr, 0, 4);
                                                arrayList2.add(new TsPayloadReader.DvbSubtitleInfo(strTrim2, unsignedByte2, bArr));
                                            }
                                            arrayList = arrayList2;
                                            i5 = TS_PMT_DESC_DVBSUBS;
                                        } else if (unsignedByte == TS_PMT_DESC_AIT) {
                                            i5 = 257;
                                        }
                                    }
                                }
                                parsableByteArray2.skipBytes(position2 - parsableByteArray2.getPosition());
                            }
                            parsableByteArray2.setPosition(i4);
                            return new TsPayloadReader.EsInfo(i5, strTrim, arrayList, Arrays.copyOfRange(parsableByteArray2.getData(), position, i4));
                        }
                    }));
                    TsExtractor.access$108(this.this$0);
                }
            }
        }
        if (TsExtractor.access$200(this.this$0) != 2) {
            TsExtractor.access$000(this.this$0).remove(0);
        }
    }
}
