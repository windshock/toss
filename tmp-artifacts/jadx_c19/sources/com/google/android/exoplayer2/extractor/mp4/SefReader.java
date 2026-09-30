package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.base.Splitter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SefReader {
    private static final int LENGTH_OF_ONE_SDR = 12;
    private static final int SAMSUNG_TAIL_SIGNATURE = 1397048916;
    private static final int STATE_CHECKING_FOR_SEF = 1;
    private static final int STATE_READING_SDRS = 2;
    private static final int STATE_READING_SEF_DATA = 3;
    private static final int STATE_SHOULD_CHECK_FOR_SEF = 0;
    private static final String TAG = "SefReader";
    private static final int TAIL_FOOTER_LENGTH = 8;
    private static final int TAIL_HEADER_LENGTH = 12;
    private static final int TYPE_SLOW_MOTION_DATA = 2192;
    private static final int TYPE_SUPER_SLOW_DEFLICKERING_ON = 2820;
    private static final int TYPE_SUPER_SLOW_MOTION_BGM = 2817;
    private static final int TYPE_SUPER_SLOW_MOTION_DATA = 2816;
    private static final int TYPE_SUPER_SLOW_MOTION_EDIT_DATA = 2819;
    private final List<DataReference> dataReferences = new ArrayList();
    private int readerState = 0;
    private int tailLength;
    private static final Splitter COLON_SPLITTER = Splitter.on(':');
    private static final Splitter ASTERISK_SPLITTER = Splitter.on('*');

    public void reset() {
        this.dataReferences.clear();
        this.readerState = 0;
    }

    public int read(ExtractorInput extractorInput, PositionHolder positionHolder, List<Metadata.Entry> list) throws ParserException, IOException {
        int i2 = this.readerState;
        long j = 0;
        if (i2 == 0) {
            long length = extractorInput.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            positionHolder.position = j;
            this.readerState = 1;
        } else if (i2 == 1) {
            checkForSefData(extractorInput, positionHolder);
        } else if (i2 == 2) {
            readSdrs(extractorInput, positionHolder);
        } else if (i2 == 3) {
            readSefData(extractorInput, list);
            positionHolder.position = 0L;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    private void checkForSefData(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        extractorInput.readFully(parsableByteArray.getData(), 0, 8);
        this.tailLength = parsableByteArray.readLittleEndianInt() + 8;
        if (parsableByteArray.readInt() != SAMSUNG_TAIL_SIGNATURE) {
            positionHolder.position = 0L;
        } else {
            positionHolder.position = extractorInput.getPosition() - (this.tailLength - 12);
            this.readerState = 2;
        }
    }

    private void readSdrs(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        long length = extractorInput.getLength();
        int i2 = this.tailLength - 20;
        ParsableByteArray parsableByteArray = new ParsableByteArray(i2);
        extractorInput.readFully(parsableByteArray.getData(), 0, i2);
        for (int i3 = 0; i3 < i2 / 12; i3++) {
            parsableByteArray.skipBytes(2);
            short littleEndianShort = parsableByteArray.readLittleEndianShort();
            if (littleEndianShort == TYPE_SLOW_MOTION_DATA || littleEndianShort == TYPE_SUPER_SLOW_MOTION_DATA || littleEndianShort == TYPE_SUPER_SLOW_MOTION_BGM || littleEndianShort == TYPE_SUPER_SLOW_MOTION_EDIT_DATA || littleEndianShort == TYPE_SUPER_SLOW_DEFLICKERING_ON) {
                long j = this.tailLength;
                this.dataReferences.add(new DataReference(littleEndianShort, (length - j) - parsableByteArray.readLittleEndianInt(), parsableByteArray.readLittleEndianInt()));
            } else {
                parsableByteArray.skipBytes(8);
            }
        }
        if (this.dataReferences.isEmpty()) {
            positionHolder.position = 0L;
        } else {
            this.readerState = 3;
            positionHolder.position = this.dataReferences.get(0).startOffset;
        }
    }

    private void readSefData(ExtractorInput extractorInput, List<Metadata.Entry> list) throws ParserException, IOException {
        long position = extractorInput.getPosition();
        int length = (int) ((extractorInput.getLength() - extractorInput.getPosition()) - this.tailLength);
        ParsableByteArray parsableByteArray = new ParsableByteArray(length);
        extractorInput.readFully(parsableByteArray.getData(), 0, length);
        for (int i2 = 0; i2 < this.dataReferences.size(); i2++) {
            DataReference dataReference = this.dataReferences.get(i2);
            parsableByteArray.setPosition((int) (dataReference.startOffset - position));
            parsableByteArray.skipBytes(4);
            int littleEndianInt = parsableByteArray.readLittleEndianInt();
            int iNameToDataType = nameToDataType(parsableByteArray.readString(littleEndianInt));
            int i3 = dataReference.size;
            if (iNameToDataType == TYPE_SLOW_MOTION_DATA) {
                list.add(readSlowMotionData(parsableByteArray, i3 - (littleEndianInt + 8)));
            } else if (iNameToDataType != TYPE_SUPER_SLOW_MOTION_DATA && iNameToDataType != TYPE_SUPER_SLOW_MOTION_BGM && iNameToDataType != TYPE_SUPER_SLOW_MOTION_EDIT_DATA && iNameToDataType != TYPE_SUPER_SLOW_DEFLICKERING_ON) {
                throw new IllegalStateException();
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    private static SlowMotionData readSlowMotionData(ParsableByteArray parsableByteArray, int i2) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> listSplitToList = ASTERISK_SPLITTER.splitToList(parsableByteArray.readString(i2));
        for (int i3 = 0; i3 < listSplitToList.size(); i3++) {
            List<String> listSplitToList2 = COLON_SPLITTER.splitToList(listSplitToList.get(i3));
            if (listSplitToList2.size() != 3) {
                throw ParserException.createForMalformedContainer((String) null, (Throwable) null);
            }
            try {
                arrayList.add(new SlowMotionData.Segment(Long.parseLong(listSplitToList2.get(0)), Long.parseLong(listSplitToList2.get(1)), 1 << (Integer.parseInt(listSplitToList2.get(2)) - 1)));
            } catch (NumberFormatException e) {
                throw ParserException.createForMalformedContainer((String) null, e);
            }
        }
        return new SlowMotionData(arrayList);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int nameToDataType(String str) throws ParserException {
        char c;
        switch (str.hashCode()) {
            case -1711564334:
                if (!str.equals("SlowMotion_Data")) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c = 4;
                    break;
                }
                break;
        }
        if (c == 0) {
            return TYPE_SLOW_MOTION_DATA;
        }
        if (c == 1) {
            return TYPE_SUPER_SLOW_MOTION_EDIT_DATA;
        }
        if (c == 2) {
            return TYPE_SUPER_SLOW_MOTION_DATA;
        }
        if (c == 3) {
            return TYPE_SUPER_SLOW_DEFLICKERING_ON;
        }
        if (c == 4) {
            return TYPE_SUPER_SLOW_MOTION_BGM;
        }
        throw ParserException.createForMalformedContainer("Invalid SEF name", (Throwable) null);
    }

    static final class DataReference {
        public final int dataType;
        public final int size;
        public final long startOffset;

        public DataReference(int i2, long j, int i3) {
            this.dataType = i2;
            this.startOffset = j;
            this.size = i3;
        }
    }
}
