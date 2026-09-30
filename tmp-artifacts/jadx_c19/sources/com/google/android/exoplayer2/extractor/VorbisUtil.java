package com.google.android.exoplayer2.extractor;

import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class VorbisUtil {
    private static final String TAG = "VorbisUtil";

    public static int iLog(int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3++;
            i2 >>>= 1;
        }
        return i3;
    }

    public static final class CommentHeader {
        public final String[] comments;
        public final int length;
        public final String vendor;

        public CommentHeader(String str, String[] strArr, int i2) {
            this.vendor = str;
            this.comments = strArr;
            this.length = i2;
        }
    }

    public static final class VorbisIdHeader {
        public final int bitrateMaximum;
        public final int bitrateMinimum;
        public final int bitrateNominal;
        public final int blockSize0;
        public final int blockSize1;
        public final int channels;
        public final byte[] data;
        public final boolean framingFlag;
        public final int sampleRate;
        public final int version;

        public VorbisIdHeader(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, byte[] bArr) {
            this.version = i2;
            this.channels = i3;
            this.sampleRate = i4;
            this.bitrateMaximum = i5;
            this.bitrateNominal = i6;
            this.bitrateMinimum = i7;
            this.blockSize0 = i8;
            this.blockSize1 = i9;
            this.framingFlag = z;
            this.data = bArr;
        }
    }

    public static final class Mode {
        public final boolean blockFlag;
        public final int mapping;
        public final int transformType;
        public final int windowType;

        public Mode(boolean z, int i2, int i3, int i4) {
            this.blockFlag = z;
            this.windowType = i2;
            this.transformType = i3;
            this.mapping = i4;
        }
    }

    public static VorbisIdHeader readVorbisIdentificationHeader(ParsableByteArray parsableByteArray) throws ParserException {
        verifyVorbisHeaderCapturePattern(1, parsableByteArray, false);
        int littleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int littleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        if (littleEndianInt <= 0) {
            littleEndianInt = -1;
        }
        int littleEndianInt2 = parsableByteArray.readLittleEndianInt();
        if (littleEndianInt2 <= 0) {
            littleEndianInt2 = -1;
        }
        int littleEndianInt3 = parsableByteArray.readLittleEndianInt();
        if (littleEndianInt3 <= 0) {
            littleEndianInt3 = -1;
        }
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        return new VorbisIdHeader(littleEndianUnsignedIntToInt, unsignedByte, littleEndianUnsignedIntToInt2, littleEndianInt, littleEndianInt2, littleEndianInt3, (int) Math.pow(2.0d, unsignedByte2 & 15), (int) Math.pow(2.0d, (unsignedByte2 & 240) >> 4), (parsableByteArray.readUnsignedByte() & 1) > 0, Arrays.copyOf(parsableByteArray.getData(), parsableByteArray.limit()));
    }

    public static CommentHeader readVorbisCommentHeader(ParsableByteArray parsableByteArray) throws ParserException {
        return readVorbisCommentHeader(parsableByteArray, true, true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    public static CommentHeader readVorbisCommentHeader(ParsableByteArray parsableByteArray, boolean z, boolean z2) throws ParserException {
        if (z) {
            verifyVorbisHeaderCapturePattern(3, parsableByteArray, false);
        }
        String string = parsableByteArray.readString((int) parsableByteArray.readLittleEndianUnsignedInt());
        int length = string.length();
        long littleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
        String[] strArr = new String[(int) littleEndianUnsignedInt];
        int length2 = length + 15;
        for (int i2 = 0; i2 < littleEndianUnsignedInt; i2++) {
            String string2 = parsableByteArray.readString((int) parsableByteArray.readLittleEndianUnsignedInt());
            strArr[i2] = string2;
            length2 = length2 + 4 + string2.length();
        }
        if (z2 && (parsableByteArray.readUnsignedByte() & 1) == 0) {
            throw ParserException.createForMalformedContainer("framing bit expected to be set", (Throwable) null);
        }
        return new CommentHeader(string, strArr, length2 + 1);
    }

    public static Metadata parseVorbisComments(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2);
            String[] strArrSplitAtFirst = Util.splitAtFirst(str, "=");
            if (strArrSplitAtFirst.length != 2) {
                Log.w(TAG, "Failed to parse Vorbis comment: " + str);
            } else if (strArrSplitAtFirst[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.fromPictureBlock(new ParsableByteArray(Base64.decode(strArrSplitAtFirst[1], 0))));
                } catch (RuntimeException e) {
                    Log.w(TAG, "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new VorbisComment(strArrSplitAtFirst[0], strArrSplitAtFirst[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    public static boolean verifyVorbisHeaderCapturePattern(int i2, ParsableByteArray parsableByteArray, boolean z) throws ParserException {
        if (parsableByteArray.bytesLeft() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.createForMalformedContainer("too short header: " + parsableByteArray.bytesLeft(), (Throwable) null);
        }
        if (parsableByteArray.readUnsignedByte() != i2) {
            if (z) {
                return false;
            }
            throw ParserException.createForMalformedContainer("expected header type " + Integer.toHexString(i2), (Throwable) null);
        }
        if (parsableByteArray.readUnsignedByte() == 118 && parsableByteArray.readUnsignedByte() == 111 && parsableByteArray.readUnsignedByte() == 114 && parsableByteArray.readUnsignedByte() == 98 && parsableByteArray.readUnsignedByte() == 105 && parsableByteArray.readUnsignedByte() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.createForMalformedContainer("expected characters 'vorbis'", (Throwable) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    public static Mode[] readVorbisModes(ParsableByteArray parsableByteArray, int i2) throws ParserException {
        verifyVorbisHeaderCapturePattern(5, parsableByteArray, false);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        VorbisBitArray vorbisBitArray = new VorbisBitArray(parsableByteArray.getData());
        vorbisBitArray.skipBits(parsableByteArray.getPosition() << 3);
        for (int i3 = 0; i3 < unsignedByte + 1; i3++) {
            readBook(vorbisBitArray);
        }
        int bits = vorbisBitArray.readBits(6);
        for (int i4 = 0; i4 < bits + 1; i4++) {
            if (vorbisBitArray.readBits(16) != 0) {
                throw ParserException.createForMalformedContainer("placeholder of time domain transforms not zeroed out", (Throwable) null);
            }
        }
        readFloors(vorbisBitArray);
        readResidues(vorbisBitArray);
        readMappings(i2, vorbisBitArray);
        Mode[] modes = readModes(vorbisBitArray);
        if (vorbisBitArray.readBit()) {
            return modes;
        }
        throw ParserException.createForMalformedContainer("framing bit after modes not set as expected", (Throwable) null);
    }

    private static Mode[] readModes(VorbisBitArray vorbisBitArray) {
        int bits = vorbisBitArray.readBits(6) + 1;
        Mode[] modeArr = new Mode[bits];
        for (int i2 = 0; i2 < bits; i2++) {
            modeArr[i2] = new Mode(vorbisBitArray.readBit(), vorbisBitArray.readBits(16), vorbisBitArray.readBits(16), vorbisBitArray.readBits(8));
        }
        return modeArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    private static void readMappings(int i2, VorbisBitArray vorbisBitArray) throws ParserException {
        int bits = vorbisBitArray.readBits(6);
        for (int i3 = 0; i3 < bits + 1; i3++) {
            int bits2 = vorbisBitArray.readBits(16);
            if (bits2 != 0) {
                Log.e(TAG, "mapping type other than 0 not supported: " + bits2);
            } else {
                int bits3 = vorbisBitArray.readBit() ? vorbisBitArray.readBits(4) + 1 : 1;
                if (vorbisBitArray.readBit()) {
                    int bits4 = vorbisBitArray.readBits(8);
                    for (int i4 = 0; i4 < bits4 + 1; i4++) {
                        int i5 = i2 - 1;
                        vorbisBitArray.skipBits(iLog(i5));
                        vorbisBitArray.skipBits(iLog(i5));
                    }
                }
                if (vorbisBitArray.readBits(2) != 0) {
                    throw ParserException.createForMalformedContainer("to reserved bits must be zero after mapping coupling steps", (Throwable) null);
                }
                if (bits3 > 1) {
                    for (int i6 = 0; i6 < i2; i6++) {
                        vorbisBitArray.skipBits(4);
                    }
                }
                for (int i7 = 0; i7 < bits3; i7++) {
                    vorbisBitArray.skipBits(8);
                    vorbisBitArray.skipBits(8);
                    vorbisBitArray.skipBits(8);
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    private static void readResidues(VorbisBitArray vorbisBitArray) throws ParserException {
        int bits = vorbisBitArray.readBits(6);
        for (int i2 = 0; i2 < bits + 1; i2++) {
            if (vorbisBitArray.readBits(16) > 2) {
                throw ParserException.createForMalformedContainer("residueType greater than 2 is not decodable", (Throwable) null);
            }
            vorbisBitArray.skipBits(24);
            vorbisBitArray.skipBits(24);
            vorbisBitArray.skipBits(24);
            int bits2 = vorbisBitArray.readBits(6) + 1;
            vorbisBitArray.skipBits(8);
            int[] iArr = new int[bits2];
            for (int i3 = 0; i3 < bits2; i3++) {
                iArr[i3] = ((vorbisBitArray.readBit() ? vorbisBitArray.readBits(5) : 0) << 3) + vorbisBitArray.readBits(3);
            }
            for (int i4 = 0; i4 < bits2; i4++) {
                for (int i5 = 0; i5 < 8; i5++) {
                    if ((iArr[i4] & (1 << i5)) != 0) {
                        vorbisBitArray.skipBits(8);
                    }
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    private static void readFloors(VorbisBitArray vorbisBitArray) throws ParserException {
        int bits = vorbisBitArray.readBits(6);
        for (int i2 = 0; i2 < bits + 1; i2++) {
            int bits2 = vorbisBitArray.readBits(16);
            if (bits2 == 0) {
                vorbisBitArray.skipBits(8);
                vorbisBitArray.skipBits(16);
                vorbisBitArray.skipBits(16);
                vorbisBitArray.skipBits(6);
                vorbisBitArray.skipBits(8);
                int bits3 = vorbisBitArray.readBits(4);
                for (int i3 = 0; i3 < bits3 + 1; i3++) {
                    vorbisBitArray.skipBits(8);
                }
            } else {
                if (bits2 != 1) {
                    throw ParserException.createForMalformedContainer("floor type greater than 1 not decodable: " + bits2, (Throwable) null);
                }
                int bits4 = vorbisBitArray.readBits(5);
                int[] iArr = new int[bits4];
                int i4 = -1;
                for (int i5 = 0; i5 < bits4; i5++) {
                    int bits5 = vorbisBitArray.readBits(4);
                    iArr[i5] = bits5;
                    if (bits5 > i4) {
                        i4 = bits5;
                    }
                }
                int i6 = i4 + 1;
                int[] iArr2 = new int[i6];
                for (int i7 = 0; i7 < i6; i7++) {
                    iArr2[i7] = vorbisBitArray.readBits(3) + 1;
                    int bits6 = vorbisBitArray.readBits(2);
                    if (bits6 > 0) {
                        vorbisBitArray.skipBits(8);
                    }
                    for (int i8 = 0; i8 < (1 << bits6); i8++) {
                        vorbisBitArray.skipBits(8);
                    }
                }
                vorbisBitArray.skipBits(2);
                int bits7 = vorbisBitArray.readBits(4);
                int i9 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < bits4; i11++) {
                    i9 += iArr2[iArr[i11]];
                    while (i10 < i9) {
                        vorbisBitArray.skipBits(bits7);
                        i10++;
                    }
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    private static CodeBook readBook(VorbisBitArray vorbisBitArray) throws ParserException {
        if (vorbisBitArray.readBits(24) != 5653314) {
            throw ParserException.createForMalformedContainer("expected code book to start with [0x56, 0x43, 0x42] at " + vorbisBitArray.getPosition(), (Throwable) null);
        }
        int bits = vorbisBitArray.readBits(16);
        int bits2 = vorbisBitArray.readBits(24);
        long[] jArr = new long[bits2];
        boolean bit = vorbisBitArray.readBit();
        long jMapType1QuantValues = 0;
        if (!bit) {
            boolean bit2 = vorbisBitArray.readBit();
            for (int i2 = 0; i2 < bits2; i2++) {
                if (bit2 && !vorbisBitArray.readBit()) {
                    jArr[i2] = 0;
                } else {
                    jArr[i2] = vorbisBitArray.readBits(5) + 1;
                }
            }
        } else {
            int bits3 = vorbisBitArray.readBits(5) + 1;
            int i3 = 0;
            while (i3 < bits2) {
                int bits4 = vorbisBitArray.readBits(iLog(bits2 - i3));
                for (int i4 = 0; i4 < bits4 && i3 < bits2; i4++) {
                    jArr[i3] = bits3;
                    i3++;
                }
                bits3++;
            }
        }
        int bits5 = vorbisBitArray.readBits(4);
        if (bits5 > 2) {
            throw ParserException.createForMalformedContainer("lookup type greater than 2 not decodable: " + bits5, (Throwable) null);
        }
        if (bits5 == 1 || bits5 == 2) {
            vorbisBitArray.skipBits(32);
            vorbisBitArray.skipBits(32);
            int bits6 = vorbisBitArray.readBits(4);
            vorbisBitArray.skipBits(1);
            if (bits5 != 1) {
                jMapType1QuantValues = bits2 * bits;
            } else if (bits != 0) {
                jMapType1QuantValues = mapType1QuantValues(bits2, bits);
            }
            vorbisBitArray.skipBits((int) (jMapType1QuantValues * (bits6 + 1)));
        }
        return new CodeBook(bits, bits2, jArr, bits5, bit);
    }

    private static long mapType1QuantValues(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    private VorbisUtil() {
    }

    static final class CodeBook {
        public final int dimensions;
        public final int entries;
        public final boolean isOrdered;
        public final long[] lengthMap;
        public final int lookupType;

        public CodeBook(int i2, int i3, long[] jArr, int i4, boolean z) {
            this.dimensions = i2;
            this.entries = i3;
            this.lengthMap = jArr;
            this.lookupType = i4;
            this.isOrdered = z;
        }
    }
}
