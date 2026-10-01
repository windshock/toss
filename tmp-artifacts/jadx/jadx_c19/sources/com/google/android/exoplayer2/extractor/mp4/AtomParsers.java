package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.mp4.FixedSampleSizeRechunker;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.DolbyVisionConfig;
import com.google.android.exoplayer2.video.HevcConfig;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class AtomParsers {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final String TAG = "AtomParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_nclc = 1852009571;
    private static final int TYPE_nclx = 1852009592;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    private static int getTrackTypeForHdlr(int i2) {
        if (i2 == TYPE_soun) {
            return 1;
        }
        if (i2 == TYPE_vide) {
            return 2;
        }
        if (i2 == TYPE_text || i2 == TYPE_sbtl || i2 == TYPE_subt || i2 == TYPE_clcp) {
            return 3;
        }
        return i2 == TYPE_meta ? 5 : -1;
    }

    public static List<TrackSampleTable> parseTraks(Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder, long j, @Nullable DrmInitData drmInitData, boolean z, boolean z2, Function<Track, Track> function) throws ParserException {
        Track track;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < containerAtom.containerChildren.size(); i2++) {
            Atom.ContainerAtom containerAtom2 = (Atom.ContainerAtom) containerAtom.containerChildren.get(i2);
            if (((Atom) containerAtom2).type == 1953653099 && (track = (Track) function.apply(parseTrak(containerAtom2, (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1836476516)), j, drmInitData, z, z2))) != null) {
                arrayList.add(parseStbl(track, (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(1835297121))).getContainerAtomOfType(1835626086))).getContainerAtomOfType(1937007212)), gaplessInfoHolder));
            }
        }
        return arrayList;
    }

    public static Pair<Metadata, Metadata> parseUdta(Atom.LeafAtom leafAtom) {
        ParsableByteArray parsableByteArray = leafAtom.data;
        parsableByteArray.setPosition(8);
        Metadata udtaMeta = null;
        Metadata smta = null;
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int i2 = parsableByteArray.readInt();
            int i3 = parsableByteArray.readInt();
            if (i3 == TYPE_meta) {
                parsableByteArray.setPosition(position);
                udtaMeta = parseUdtaMeta(parsableByteArray, position + i2);
            } else if (i3 == 1936553057) {
                parsableByteArray.setPosition(position);
                smta = parseSmta(parsableByteArray, position + i2);
            }
            parsableByteArray.setPosition(position + i2);
        }
        return Pair.create(udtaMeta, smta);
    }

    public static Metadata parseMdtaFromMeta(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1751411826);
        Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(1801812339);
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(1768715124);
        if (leafAtomOfType == null || leafAtomOfType2 == null || leafAtomOfType3 == null || parseHdlr(leafAtomOfType.data) != TYPE_mdta) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType2.data;
        parsableByteArray.setPosition(12);
        int i2 = parsableByteArray.readInt();
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i3] = parsableByteArray.readString(i4 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafAtomOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int i5 = parsableByteArray2.readInt();
            int i6 = parsableByteArray2.readInt() - 1;
            if (i6 >= 0 && i6 < i2) {
                MdtaMetadataEntry mdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + i5, strArr[i6]);
                if (mdtaMetadataEntryFromIlst != null) {
                    arrayList.add(mdtaMetadataEntryFromIlst);
                }
            } else {
                Log.w(TAG, "Skipped metadata with unknown key index: " + i6);
            }
            parsableByteArray2.setPosition(position + i5);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static void maybeSkipRemainingMetaAtomHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    private static Track parseTrak(Atom.ContainerAtom containerAtom, Atom.LeafAtom leafAtom, long j, @Nullable DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        Atom.LeafAtom leafAtom2;
        long j2;
        long[] jArr;
        long[] jArr2;
        Atom.ContainerAtom containerAtomOfType;
        Pair<long[], long[]> edts;
        Atom.ContainerAtom containerAtom2 = (Atom.ContainerAtom) Assertions.checkNotNull(containerAtom.getContainerAtomOfType(1835297121));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(1751411826))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData tkhd = parseTkhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1953196132))).data);
        if (j == -9223372036854775807L) {
            leafAtom2 = leafAtom;
            j2 = tkhd.duration;
        } else {
            leafAtom2 = leafAtom;
            j2 = j;
        }
        long mvhd = parseMvhd(leafAtom2.data);
        long jScaleLargeTimestamp = j2 != -9223372036854775807L ? Util.scaleLargeTimestamp(j2, 1000000L, mvhd) : -9223372036854775807L;
        Atom.ContainerAtom containerAtom3 = (Atom.ContainerAtom) Assertions.checkNotNull(((Atom.ContainerAtom) Assertions.checkNotNull(containerAtom2.getContainerAtomOfType(1835626086))).getContainerAtomOfType(1937007212));
        Pair<Long, String> mdhd = parseMdhd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom2.getLeafAtomOfType(1835296868))).data);
        StsdData stsd = parseStsd(((Atom.LeafAtom) Assertions.checkNotNull(containerAtom3.getLeafAtomOfType(1937011556))).data, tkhd.id, tkhd.rotationDegrees, (String) mdhd.second, drmInitData, z2);
        if (z || (containerAtomOfType = containerAtom.getContainerAtomOfType(1701082227)) == null || (edts = parseEdts(containerAtomOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) edts.first;
            jArr2 = (long[]) edts.second;
            jArr = jArr3;
        }
        if (stsd.format == null) {
            return null;
        }
        return new Track(tkhd.id, trackTypeForHdlr, ((Long) mdhd.first).longValue(), mvhd, jScaleLargeTimestamp, stsd.format, stsd.requiredSampleTransformation, stsd.trackEncryptionBoxes, stsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0279  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TrackSampleTable parseStbl(Track track, Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        SampleSizeBox stz2SampleSizeBox;
        boolean z;
        int unsignedIntToInt;
        int unsignedIntToInt2;
        int unsignedIntToInt3;
        boolean z2;
        int i2;
        int i3;
        long[] jArr;
        Track track2;
        int i4;
        int[] iArr;
        int[] iArr2;
        int i5;
        long[] jArr2;
        long j;
        long[] jArr3;
        int i6;
        long[] jArr4;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1937011578);
        if (leafAtomOfType != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafAtomOfType, track.format);
        } else {
            Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(1937013298);
            if (leafAtomOfType2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", (Throwable) null);
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafAtomOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(track, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(1937007471);
        if (leafAtomOfType3 == null) {
            leafAtomOfType3 = (Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1668232756));
            z = true;
        } else {
            z = false;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType3.data;
        ParsableByteArray parsableByteArray2 = ((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1937011555))).data;
        ParsableByteArray parsableByteArray3 = ((Atom.LeafAtom) Assertions.checkNotNull(containerAtom.getLeafAtomOfType(1937011827))).data;
        Atom.LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(1937011571);
        ParsableByteArray parsableByteArray4 = leafAtomOfType4 != null ? leafAtomOfType4.data : null;
        Atom.LeafAtom leafAtomOfType5 = containerAtom.getLeafAtomOfType(1668576371);
        ParsableByteArray parsableByteArray5 = leafAtomOfType5 != null ? leafAtomOfType5.data : null;
        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray2, parsableByteArray, z);
        parsableByteArray3.setPosition(12);
        int unsignedIntToInt4 = parsableByteArray3.readUnsignedIntToInt() - 1;
        int unsignedIntToInt5 = parsableByteArray3.readUnsignedIntToInt();
        int unsignedIntToInt6 = parsableByteArray3.readUnsignedIntToInt();
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            unsignedIntToInt = parsableByteArray5.readUnsignedIntToInt();
        } else {
            unsignedIntToInt = 0;
        }
        if (parsableByteArray4 != null) {
            parsableByteArray4.setPosition(12);
            unsignedIntToInt3 = parsableByteArray4.readUnsignedIntToInt();
            if (unsignedIntToInt3 > 0) {
                unsignedIntToInt2 = parsableByteArray4.readUnsignedIntToInt() - 1;
            } else {
                unsignedIntToInt2 = -1;
                parsableByteArray4 = null;
            }
        } else {
            unsignedIntToInt2 = -1;
            unsignedIntToInt3 = 0;
        }
        int fixedSampleSize = stz2SampleSizeBox.getFixedSampleSize();
        String str = track.format.sampleMimeType;
        if (fixedSampleSize != -1 && (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && unsignedIntToInt4 == 0 && unsignedIntToInt == 0 && unsignedIntToInt3 == 0)) {
            int i10 = chunkIterator.length;
            long[] jArr5 = new long[i10];
            int[] iArr7 = new int[i10];
            while (chunkIterator.moveNext()) {
                int i11 = chunkIterator.index;
                jArr5[i11] = chunkIterator.offset;
                iArr7[i11] = chunkIterator.numSamples;
            }
            FixedSampleSizeRechunker.Results resultsRechunk = FixedSampleSizeRechunker.rechunk(fixedSampleSize, jArr5, iArr7, unsignedIntToInt6);
            long[] jArr6 = resultsRechunk.offsets;
            iArr2 = resultsRechunk.sizes;
            int i12 = resultsRechunk.maximumSize;
            long[] jArr7 = resultsRechunk.timestamps;
            int[] iArr8 = resultsRechunk.flags;
            long j2 = resultsRechunk.duration;
            i4 = sampleCount;
            jArr2 = jArr6;
            i5 = i12;
            jArr3 = jArr7;
            iArr = iArr8;
            j = j2;
            track2 = track;
        } else {
            long[] jArrCopyOf = new long[sampleCount];
            int[] iArrCopyOf = new int[sampleCount];
            long[] jArrCopyOf2 = new long[sampleCount];
            int[] iArrCopyOf2 = new int[sampleCount];
            int i13 = unsignedIntToInt4;
            int i14 = unsignedIntToInt;
            int i15 = unsignedIntToInt2;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int unsignedIntToInt7 = 0;
            long j3 = 0;
            long j4 = 0;
            while (true) {
                if (i17 >= sampleCount) {
                    break;
                }
                long j5 = j4;
                boolean zMoveNext = true;
                while (i18 == 0) {
                    zMoveNext = chunkIterator.moveNext();
                    if (!zMoveNext) {
                        break;
                    }
                    j5 = chunkIterator.offset;
                    i18 = chunkIterator.numSamples;
                    sampleCount = sampleCount;
                    i15 = i15;
                }
                int i20 = i15;
                int i21 = sampleCount;
                if (!zMoveNext) {
                    Log.w(TAG, "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i17);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i17);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i17);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i17);
                    sampleCount = i17;
                    break;
                }
                int i22 = i14;
                if (parsableByteArray5 != null) {
                    while (unsignedIntToInt7 == 0 && i22 > 0) {
                        unsignedIntToInt7 = parsableByteArray5.readUnsignedIntToInt();
                        i19 = parsableByteArray5.readInt();
                        i22--;
                    }
                    unsignedIntToInt7--;
                }
                int i23 = i19;
                jArrCopyOf[i17] = j5;
                int nextSampleSize = stz2SampleSizeBox.readNextSampleSize();
                iArrCopyOf[i17] = nextSampleSize;
                long[] jArr8 = jArrCopyOf;
                SampleSizeBox sampleSizeBox = stz2SampleSizeBox;
                if (nextSampleSize > i16) {
                    i16 = nextSampleSize;
                }
                jArrCopyOf2[i17] = j3 + i23;
                iArrCopyOf2[i17] = parsableByteArray4 == null ? 1 : 0;
                int unsignedIntToInt8 = i20;
                if (i17 == unsignedIntToInt8) {
                    iArrCopyOf2[i17] = 1;
                    unsignedIntToInt3--;
                    if (unsignedIntToInt3 > 0) {
                        unsignedIntToInt8 = ((ParsableByteArray) Assertions.checkNotNull(parsableByteArray4)).readUnsignedIntToInt() - 1;
                    }
                }
                int[] iArr9 = iArrCopyOf2;
                i14 = i22;
                j3 += unsignedIntToInt6;
                unsignedIntToInt5--;
                if (unsignedIntToInt5 == 0 && i13 > 0) {
                    i13--;
                    unsignedIntToInt5 = parsableByteArray3.readUnsignedIntToInt();
                    unsignedIntToInt6 = parsableByteArray3.readInt();
                }
                long j6 = iArrCopyOf[i17];
                i18--;
                i17++;
                long j7 = j5 + j6;
                i19 = i23;
                sampleCount = i21;
                i15 = unsignedIntToInt8;
                iArrCopyOf2 = iArr9;
                stz2SampleSizeBox = sampleSizeBox;
                jArrCopyOf = jArr8;
                j4 = j7;
            }
            int i24 = i18;
            long j8 = j3 + i19;
            if (parsableByteArray5 != null) {
                for (int i25 = i14; i25 > 0; i25--) {
                    if (parsableByteArray5.readUnsignedIntToInt() != 0) {
                        z2 = false;
                        break;
                    }
                    parsableByteArray5.readInt();
                }
                z2 = true;
                if (unsignedIntToInt3 != 0 && unsignedIntToInt5 == 0 && i24 == 0 && i13 == 0) {
                    i2 = unsignedIntToInt7;
                    if (i2 == 0 && z2) {
                        i3 = sampleCount;
                        jArr = jArrCopyOf;
                        track2 = track;
                    }
                    i4 = i3;
                    iArr = iArrCopyOf2;
                    iArr2 = iArrCopyOf;
                    i5 = i16;
                    jArr2 = jArr;
                    j = j8;
                    jArr3 = jArrCopyOf2;
                } else {
                    i2 = unsignedIntToInt7;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Inconsistent stbl box for track ");
                i3 = sampleCount;
                jArr = jArrCopyOf;
                track2 = track;
                sb.append(track2.id);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(unsignedIntToInt3);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(unsignedIntToInt5);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i24);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i13);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i2);
                sb.append(z2 ? ", ctts invalid" : "");
                Log.w(TAG, sb.toString());
                i4 = i3;
                iArr = iArrCopyOf2;
                iArr2 = iArrCopyOf;
                i5 = i16;
                jArr2 = jArr;
                j = j8;
                jArr3 = jArrCopyOf2;
            } else {
                z2 = true;
                if (unsignedIntToInt3 != 0) {
                    i2 = unsignedIntToInt7;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Inconsistent stbl box for track ");
                    i3 = sampleCount;
                    jArr = jArrCopyOf;
                    track2 = track;
                    sb2.append(track2.id);
                    sb2.append(": remainingSynchronizationSamples ");
                    sb2.append(unsignedIntToInt3);
                    sb2.append(", remainingSamplesAtTimestampDelta ");
                    sb2.append(unsignedIntToInt5);
                    sb2.append(", remainingSamplesInChunk ");
                    sb2.append(i24);
                    sb2.append(", remainingTimestampDeltaChanges ");
                    sb2.append(i13);
                    sb2.append(", remainingSamplesAtTimestampOffset ");
                    sb2.append(i2);
                    sb2.append(z2 ? ", ctts invalid" : "");
                    Log.w(TAG, sb2.toString());
                    i4 = i3;
                    iArr = iArrCopyOf2;
                    iArr2 = iArrCopyOf;
                    i5 = i16;
                    jArr2 = jArr;
                    j = j8;
                    jArr3 = jArrCopyOf2;
                }
            }
        }
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, track2.timescale);
        long[] jArr9 = track2.editListDurations;
        if (jArr9 == null) {
            Util.scaleLargeTimestampsInPlace(jArr3, 1000000L, track2.timescale);
            return new TrackSampleTable(track, jArr2, iArr2, i5, jArr3, iArr, jScaleLargeTimestamp);
        }
        if (jArr9.length == 1 && track2.type == 1 && jArr3.length >= 2) {
            long j9 = ((long[]) Assertions.checkNotNull(track2.editListMediaTimes))[0];
            long jScaleLargeTimestamp2 = j9 + Util.scaleLargeTimestamp(track2.editListDurations[0], track2.timescale, track2.movieTimescale);
            i6 = i4;
            if (canApplyEditWithGaplessInfo(jArr3, j, j9, jScaleLargeTimestamp2)) {
                long jScaleLargeTimestamp3 = Util.scaleLargeTimestamp(j9 - jArr3[0], track2.format.sampleRate, track2.timescale);
                long jScaleLargeTimestamp4 = Util.scaleLargeTimestamp(j - jScaleLargeTimestamp2, track2.format.sampleRate, track2.timescale);
                if ((jScaleLargeTimestamp3 != 0 || jScaleLargeTimestamp4 != 0) && jScaleLargeTimestamp3 <= 2147483647L && jScaleLargeTimestamp4 <= 2147483647L) {
                    gaplessInfoHolder.encoderDelay = (int) jScaleLargeTimestamp3;
                    gaplessInfoHolder.encoderPadding = (int) jScaleLargeTimestamp4;
                    Util.scaleLargeTimestampsInPlace(jArr3, 1000000L, track2.timescale);
                    return new TrackSampleTable(track, jArr2, iArr2, i5, jArr3, iArr, Util.scaleLargeTimestamp(track2.editListDurations[0], 1000000L, track2.movieTimescale));
                }
            }
        } else {
            i6 = i4;
        }
        long[] jArr10 = track2.editListDurations;
        if (jArr10.length == 1 && jArr10[0] == 0) {
            long j10 = ((long[]) Assertions.checkNotNull(track2.editListMediaTimes))[0];
            for (int i26 = 0; i26 < jArr3.length; i26++) {
                jArr3[i26] = Util.scaleLargeTimestamp(jArr3[i26] - j10, 1000000L, track2.timescale);
            }
            return new TrackSampleTable(track, jArr2, iArr2, i5, jArr3, iArr, Util.scaleLargeTimestamp(j - j10, 1000000L, track2.timescale));
        }
        boolean z4 = track2.type == 1;
        int[] iArr10 = new int[jArr10.length];
        int[] iArr11 = new int[jArr10.length];
        long[] jArr11 = (long[]) Assertions.checkNotNull(track2.editListMediaTimes);
        int i27 = 0;
        int i28 = 0;
        boolean z5 = false;
        int i29 = 0;
        while (true) {
            long[] jArr12 = track2.editListDurations;
            if (i27 >= jArr12.length) {
                break;
            }
            int i30 = i5;
            int[] iArr12 = iArr2;
            long j11 = jArr11[i27];
            if (j11 != -1) {
                long j12 = jArr12[i27];
                boolean z6 = z5;
                int i31 = i29;
                iArr6 = iArr;
                i7 = i30;
                long jScaleLargeTimestamp5 = Util.scaleLargeTimestamp(j12, track2.timescale, track2.movieTimescale);
                iArr10[i27] = Util.binarySearchFloor(jArr3, j11, true, true);
                iArr11[i27] = Util.binarySearchCeil(jArr3, j11 + jScaleLargeTimestamp5, z4, false);
                while (true) {
                    i8 = iArr10[i27];
                    i9 = iArr11[i27];
                    if (i8 >= i9 || (iArr6[i8] & 1) != 0) {
                        break;
                    }
                    iArr10[i27] = i8 + 1;
                }
                i28 += i9 - i8;
                z3 = z6 | (i31 != i8);
                i29 = i9;
            } else {
                iArr6 = iArr;
                i7 = i30;
                z3 = z5;
            }
            i27++;
            iArr2 = iArr12;
            z5 = z3;
            iArr = iArr6;
            i5 = i7;
        }
        int i32 = i5;
        int[] iArr13 = iArr2;
        int[] iArr14 = iArr;
        boolean z7 = z5 | (i28 != i6);
        long[] jArr13 = z7 ? new long[i28] : jArr2;
        int[] iArr15 = z7 ? new int[i28] : iArr13;
        if (z7) {
            i32 = 0;
        }
        int[] iArr16 = z7 ? new int[i28] : iArr14;
        long[] jArr14 = new long[i28];
        int i33 = 0;
        int i34 = 0;
        long j13 = 0;
        while (i33 < track2.editListDurations.length) {
            long j14 = track2.editListMediaTimes[i33];
            int i35 = iArr10[i33];
            int i36 = iArr11[i33];
            int[] iArr17 = iArr11;
            if (z7) {
                int i37 = i36 - i35;
                System.arraycopy(jArr2, i35, jArr13, i34, i37);
                jArr4 = jArr2;
                iArr5 = iArr13;
                System.arraycopy(iArr5, i35, iArr15, i34, i37);
                iArr3 = iArr10;
                iArr4 = iArr14;
                System.arraycopy(iArr4, i35, iArr16, i34, i37);
            } else {
                jArr4 = jArr2;
                iArr3 = iArr10;
                iArr4 = iArr14;
                iArr5 = iArr13;
            }
            int i38 = i32;
            while (i35 < i36) {
                int[] iArr18 = iArr4;
                int[] iArr19 = iArr16;
                long j15 = j13;
                long[] jArr15 = jArr3;
                int i39 = i35;
                jArr14[i34] = Util.scaleLargeTimestamp(j13, 1000000L, track2.movieTimescale) + Util.scaleLargeTimestamp(Math.max(0L, jArr3[i35] - j14), 1000000L, track2.timescale);
                if (z7 && iArr15[i34] > i38) {
                    i38 = iArr5[i39];
                }
                i34++;
                j13 = j15;
                i35 = i39 + 1;
                iArr16 = iArr19;
                jArr3 = jArr15;
                iArr4 = iArr18;
            }
            int[] iArr20 = iArr4;
            j13 += track2.editListDurations[i33];
            i33++;
            i32 = i38;
            iArr13 = iArr5;
            jArr3 = jArr3;
            iArr11 = iArr17;
            jArr2 = jArr4;
            iArr10 = iArr3;
            iArr14 = iArr20;
        }
        return new TrackSampleTable(track, jArr13, iArr15, i32, jArr14, iArr16, Util.scaleLargeTimestamp(j13, 1000000L, track2.movieTimescale));
    }

    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i2) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaAtomHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i2) {
            int position = parsableByteArray.getPosition();
            int i3 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + i3);
            }
            parsableByteArray.setPosition(position + i3);
        }
        return null;
    }

    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i2) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i2) {
            Metadata.Entry ilstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (ilstElement != null) {
                arrayList.add(ilstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Metadata parseSmta(ParsableByteArray parsableByteArray, int i2) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i2) {
            int position = parsableByteArray.getPosition();
            int i3 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1935766900) {
                if (i3 < 14) {
                    return null;
                }
                parsableByteArray.skipBytes(5);
                int unsignedByte = parsableByteArray.readUnsignedByte();
                if (unsignedByte != 12 && unsignedByte != 13) {
                    return null;
                }
                float f = unsignedByte == 12 ? 240.0f : 120.0f;
                parsableByteArray.skipBytes(1);
                return new Metadata(new Metadata.Entry[]{new SmtaMetadataEntry(f, parsableByteArray.readUnsignedByte())});
            }
            parsableByteArray.setPosition(position + i3);
        }
        return null;
    }

    private static long parseMvhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        parsableByteArray.skipBytes(Atom.parseFullAtomVersion(parsableByteArray.readInt()) != 0 ? 16 : 8);
        return parsableByteArray.readUnsignedInt();
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        long j;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        int i2 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i3 = fullAtomVersion == 0 ? 4 : 8;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i5 < i3) {
                if (parsableByteArray.getData()[position + i5] != -1) {
                    long unsignedInt = fullAtomVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                    if (unsignedInt != 0) {
                        j = unsignedInt;
                    }
                } else {
                    i5++;
                }
            } else {
                parsableByteArray.skipBytes(i3);
                break;
            }
        }
        parsableByteArray.skipBytes(16);
        int i6 = parsableByteArray.readInt();
        int i7 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int i8 = parsableByteArray.readInt();
        int i9 = parsableByteArray.readInt();
        if (i6 == 0 && i7 == 65536 && i8 == -65536 && i9 == 0) {
            i4 = 90;
        } else if (i6 == 0 && i7 == -65536 && i8 == 65536 && i9 == 0) {
            i4 = 270;
        } else if (i6 == -65536 && i7 == 0 && i8 == 0 && i9 == -65536) {
            i4 = 180;
        }
        return new TkhdData(i2, j, i4);
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    private static Pair<Long, String> parseMdhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 4 : 8);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((unsignedShort >> 10) & 31) + 96));
        sb.append((char) (((unsignedShort >> 5) & 31) + 96));
        sb.append((char) ((unsignedShort & 31) + 96));
        return Pair.create(Long.valueOf(unsignedInt), sb.toString());
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i2, int i3, String str, @Nullable DrmInitData drmInitData, boolean z) throws ParserException {
        int i4;
        parsableByteArray.setPosition(12);
        int i5 = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(i5);
        for (int i6 = 0; i6 < i5; i6++) {
            int position = parsableByteArray.getPosition();
            int i7 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i7 > 0, "childAtomSize must be positive");
            int i8 = parsableByteArray.readInt();
            if (i8 == 1635148593 || i8 == 1635148595 || i8 == 1701733238 || i8 == 1831958048 || i8 == 1836070006 || i8 == 1752589105 || i8 == 1751479857 || i8 == 1932670515 || i8 == 1211250227 || i8 == 1987063864 || i8 == 1987063865 || i8 == 1635135537 || i8 == 1685479798 || i8 == 1685479729 || i8 == 1685481573 || i8 == 1685481521) {
                i4 = position;
                parseVideoSampleEntry(parsableByteArray, i8, i4, i7, i2, i3, drmInitData, stsdData, i6);
            } else if (i8 == 1836069985 || i8 == 1701733217 || i8 == 1633889587 || i8 == 1700998451 || i8 == 1633889588 || i8 == 1835823201 || i8 == 1685353315 || i8 == 1685353317 || i8 == 1685353320 || i8 == 1685353324 || i8 == 1685353336 || i8 == 1935764850 || i8 == 1935767394 || i8 == 1819304813 || i8 == 1936684916 || i8 == 1953984371 || i8 == 778924082 || i8 == 778924083 || i8 == 1835557169 || i8 == 1835560241 || i8 == 1634492771 || i8 == 1634492791 || i8 == 1970037111 || i8 == 1332770163 || i8 == 1716281667) {
                i4 = position;
                parseAudioSampleEntry(parsableByteArray, i8, position, i7, i2, str, z, drmInitData, stsdData, i6);
            } else {
                if (i8 == 1414810956 || i8 == 1954034535 || i8 == 2004251764 || i8 == 1937010800 || i8 == 1664495672) {
                    parseTextSampleEntry(parsableByteArray, i8, position, i7, i2, str, stsdData);
                } else if (i8 == 1835365492) {
                    parseMetaDataSampleEntry(parsableByteArray, i8, position, i2, stsdData);
                } else if (i8 == 1667329389) {
                    stsdData.format = new Format.Builder().setId(i2).setSampleMimeType("application/x-camera-motion").build();
                }
                i4 = position;
            }
            parsableByteArray.setPosition(i4 + i7);
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i2, int i3, int i4, int i5, String str, StsdData stsdData) {
        parsableByteArray.setPosition(i3 + 16);
        String str2 = "application/ttml+xml";
        ImmutableList immutableListOf = null;
        long j = Long.MAX_VALUE;
        if (i2 != 1414810956) {
            if (i2 == 1954034535) {
                int i6 = i4 - 16;
                byte[] bArr = new byte[i6];
                parsableByteArray.readBytes(bArr, 0, i6);
                immutableListOf = ImmutableList.of(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i2 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i2 == 1937010800) {
                j = 0;
            } else if (i2 == 1664495672) {
                stsdData.requiredSampleTransformation = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        stsdData.format = new Format.Builder().setId(i5).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j).setInitializationData(immutableListOf).build();
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i2, int i3, int i4, int i5, int i6, @Nullable DrmInitData drmInitData, StsdData stsdData, int i7) throws ParserException {
        String str;
        DrmInitData drmInitData2;
        int i8;
        int i9;
        DrmInitData drmInitData3;
        int i10;
        int i11;
        float f;
        int i12;
        String str2;
        int i13;
        List<byte[]> list;
        String str3;
        int i14 = i3;
        int i15 = i4;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        StsdData stsdData2 = stsdData;
        parsableByteArray.setPosition(i14 + 16);
        parsableByteArray.skipBytes(16);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int iIntValue = i2;
        if (iIntValue == 1701733238) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i14, i15);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData2.trackEncryptionBoxes[i7] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str4 = "video/3gpp";
        if (iIntValue != 1831958048) {
            str = iIntValue == 1211250227 ? "video/3gpp" : null;
        } else {
            str = "video/mpeg";
        }
        float paspFromParent = 1.0f;
        String str5 = null;
        int iIsoColorPrimariesToColorSpace = -1;
        int i16 = -1;
        List<byte[]> listOf = null;
        byte[] projFromParent = null;
        int i17 = -1;
        int iIsoTransferCharacteristicsToColorTransfer = -1;
        ByteBuffer byteBufferAllocateHdrStaticInfo = null;
        EsdsData esdsData = null;
        boolean z = false;
        while (true) {
            if (position - i14 >= i15) {
                drmInitData2 = drmInitDataCopyWithSchemeType;
                i8 = unsignedShort2;
                i9 = iIsoColorPrimariesToColorSpace;
                break;
            }
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            String str6 = str4;
            int i18 = parsableByteArray.readInt();
            if (i18 == 0) {
                i9 = iIsoColorPrimariesToColorSpace;
                if (parsableByteArray.getPosition() - i14 == i15) {
                    drmInitData2 = drmInitDataCopyWithSchemeType;
                    i8 = unsignedShort2;
                    break;
                }
            } else {
                i9 = iIsoColorPrimariesToColorSpace;
            }
            ExtractorUtil.checkContainerInput(i18 > 0, "childAtomSize must be positive");
            int i19 = parsableByteArray.readInt();
            if (i19 == 1635148611) {
                ExtractorUtil.checkContainerInput(str == null, null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig avcConfig = AvcConfig.parse(parsableByteArray);
                list = avcConfig.initializationData;
                stsdData2.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                if (!z) {
                    paspFromParent = avcConfig.pixelWidthHeightRatio;
                }
                str5 = avcConfig.codecs;
                str3 = "video/avc";
            } else if (i19 == 1752589123) {
                ExtractorUtil.checkContainerInput(str == null, null);
                parsableByteArray.setPosition(position2 + 8);
                HevcConfig hevcConfig = HevcConfig.parse(parsableByteArray);
                list = hevcConfig.initializationData;
                stsdData2.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                if (!z) {
                    paspFromParent = hevcConfig.pixelWidthHeightRatio;
                }
                str5 = hevcConfig.codecs;
                str3 = "video/hevc";
            } else {
                if (i19 == 1685480259 || i19 == 1685485123) {
                    drmInitData3 = drmInitDataCopyWithSchemeType;
                    i10 = unsignedShort2;
                    i11 = iIntValue;
                    f = paspFromParent;
                    i12 = i16;
                    DolbyVisionConfig dolbyVisionConfig = DolbyVisionConfig.parse(parsableByteArray);
                    if (dolbyVisionConfig != null) {
                        str5 = dolbyVisionConfig.codecs;
                        str = "video/dolby-vision";
                    }
                } else {
                    if (i19 == 1987076931) {
                        ExtractorUtil.checkContainerInput(str == null, null);
                        str = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                    } else if (i19 == 1635135811) {
                        ExtractorUtil.checkContainerInput(str == null, null);
                        str = "video/av01";
                    } else if (i19 == 1668050025) {
                        if (byteBufferAllocateHdrStaticInfo == null) {
                            byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                        }
                        ByteBuffer byteBuffer = byteBufferAllocateHdrStaticInfo;
                        byteBuffer.position(21);
                        byteBuffer.putShort(parsableByteArray.readShort());
                        byteBuffer.putShort(parsableByteArray.readShort());
                        byteBufferAllocateHdrStaticInfo = byteBuffer;
                    } else if (i19 == 1835295606) {
                        if (byteBufferAllocateHdrStaticInfo == null) {
                            byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                        }
                        ByteBuffer byteBuffer2 = byteBufferAllocateHdrStaticInfo;
                        short s = parsableByteArray.readShort();
                        short s2 = parsableByteArray.readShort();
                        short s3 = parsableByteArray.readShort();
                        i11 = iIntValue;
                        short s4 = parsableByteArray.readShort();
                        short s5 = parsableByteArray.readShort();
                        drmInitData3 = drmInitDataCopyWithSchemeType;
                        short s6 = parsableByteArray.readShort();
                        i13 = i16;
                        short s7 = parsableByteArray.readShort();
                        float f2 = paspFromParent;
                        short s8 = parsableByteArray.readShort();
                        long unsignedInt = parsableByteArray.readUnsignedInt();
                        long unsignedInt2 = parsableByteArray.readUnsignedInt();
                        i10 = unsignedShort2;
                        byteBuffer2.position(1);
                        byteBuffer2.putShort(s5);
                        byteBuffer2.putShort(s6);
                        byteBuffer2.putShort(s);
                        byteBuffer2.putShort(s2);
                        byteBuffer2.putShort(s3);
                        byteBuffer2.putShort(s4);
                        byteBuffer2.putShort(s7);
                        byteBuffer2.putShort(s8);
                        byteBuffer2.putShort((short) (unsignedInt / 10000));
                        byteBuffer2.putShort((short) (unsignedInt2 / 10000));
                        byteBufferAllocateHdrStaticInfo = byteBuffer2;
                        paspFromParent = f2;
                        iIsoColorPrimariesToColorSpace = i9;
                        i16 = i13;
                        position += i18;
                        i14 = i3;
                        i15 = i4;
                        stsdData2 = stsdData;
                        str4 = str6;
                        iIntValue = i11;
                        drmInitDataCopyWithSchemeType = drmInitData3;
                        unsignedShort2 = i10;
                    } else {
                        drmInitData3 = drmInitDataCopyWithSchemeType;
                        i10 = unsignedShort2;
                        i11 = iIntValue;
                        f = paspFromParent;
                        i12 = i16;
                        if (i19 == 1681012275) {
                            ExtractorUtil.checkContainerInput(str == null, null);
                            str = str6;
                        } else if (i19 == 1702061171) {
                            ExtractorUtil.checkContainerInput(str == null, null);
                            EsdsData esdsFromParent = parseEsdsFromParent(parsableByteArray, position2);
                            str2 = esdsFromParent.mimeType;
                            byte[] bArr = esdsFromParent.initializationData;
                            if (bArr != null) {
                                listOf = ImmutableList.of(bArr);
                            }
                            esdsData = esdsFromParent;
                            iIsoColorPrimariesToColorSpace = i9;
                            i16 = i12;
                            str = str2;
                            paspFromParent = f;
                            position += i18;
                            i14 = i3;
                            i15 = i4;
                            stsdData2 = stsdData;
                            str4 = str6;
                            iIntValue = i11;
                            drmInitDataCopyWithSchemeType = drmInitData3;
                            unsignedShort2 = i10;
                        } else if (i19 == 1885434736) {
                            paspFromParent = parsePaspFromParent(parsableByteArray, position2);
                            iIsoColorPrimariesToColorSpace = i9;
                            i16 = i12;
                            z = true;
                            position += i18;
                            i14 = i3;
                            i15 = i4;
                            stsdData2 = stsdData;
                            str4 = str6;
                            iIntValue = i11;
                            drmInitDataCopyWithSchemeType = drmInitData3;
                            unsignedShort2 = i10;
                        } else if (i19 == 1937126244) {
                            projFromParent = parseProjFromParent(parsableByteArray, position2, i18);
                            iIsoColorPrimariesToColorSpace = i9;
                            i16 = i12;
                            paspFromParent = f;
                            position += i18;
                            i14 = i3;
                            i15 = i4;
                            stsdData2 = stsdData;
                            str4 = str6;
                            iIntValue = i11;
                            drmInitDataCopyWithSchemeType = drmInitData3;
                            unsignedShort2 = i10;
                        } else if (i19 == 1936995172) {
                            int unsignedByte = parsableByteArray.readUnsignedByte();
                            parsableByteArray.skipBytes(3);
                            if (unsignedByte == 0) {
                                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                                if (unsignedByte2 != 0) {
                                    if (unsignedByte2 == 1) {
                                        i16 = 1;
                                    } else if (unsignedByte2 == 2) {
                                        i16 = 2;
                                    } else if (unsignedByte2 == 3) {
                                        i16 = 3;
                                    }
                                    iIsoColorPrimariesToColorSpace = i9;
                                } else {
                                    iIsoColorPrimariesToColorSpace = i9;
                                    i16 = 0;
                                }
                                str2 = str;
                                str = str2;
                                paspFromParent = f;
                                position += i18;
                                i14 = i3;
                                i15 = i4;
                                stsdData2 = stsdData;
                                str4 = str6;
                                iIntValue = i11;
                                drmInitDataCopyWithSchemeType = drmInitData3;
                                unsignedShort2 = i10;
                            }
                        } else {
                            if (i19 == 1668246642) {
                                int i20 = parsableByteArray.readInt();
                                if (i20 == TYPE_nclx || i20 == TYPE_nclc) {
                                    int unsignedShort3 = parsableByteArray.readUnsignedShort();
                                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                                    parsableByteArray.skipBytes(2);
                                    boolean z2 = i18 == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                                    iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(unsignedShort3);
                                    i17 = z2 ? 1 : 2;
                                    iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedShort4);
                                    i16 = i12;
                                    str2 = str;
                                    str = str2;
                                    paspFromParent = f;
                                } else {
                                    Log.w(TAG, "Unsupported color type: " + Atom.getAtomTypeString(i20));
                                }
                            }
                            position += i18;
                            i14 = i3;
                            i15 = i4;
                            stsdData2 = stsdData;
                            str4 = str6;
                            iIntValue = i11;
                            drmInitDataCopyWithSchemeType = drmInitData3;
                            unsignedShort2 = i10;
                        }
                    }
                    drmInitData3 = drmInitDataCopyWithSchemeType;
                    i10 = unsignedShort2;
                    i11 = iIntValue;
                    i13 = i16;
                    iIsoColorPrimariesToColorSpace = i9;
                    i16 = i13;
                    position += i18;
                    i14 = i3;
                    i15 = i4;
                    stsdData2 = stsdData;
                    str4 = str6;
                    iIntValue = i11;
                    drmInitDataCopyWithSchemeType = drmInitData3;
                    unsignedShort2 = i10;
                }
                iIsoColorPrimariesToColorSpace = i9;
                i16 = i12;
                str2 = str;
                str = str2;
                paspFromParent = f;
                position += i18;
                i14 = i3;
                i15 = i4;
                stsdData2 = stsdData;
                str4 = str6;
                iIntValue = i11;
                drmInitDataCopyWithSchemeType = drmInitData3;
                unsignedShort2 = i10;
            }
            drmInitData3 = drmInitDataCopyWithSchemeType;
            i10 = unsignedShort2;
            listOf = list;
            i11 = iIntValue;
            i13 = i16;
            str = str3;
            iIsoColorPrimariesToColorSpace = i9;
            i16 = i13;
            position += i18;
            i14 = i3;
            i15 = i4;
            stsdData2 = stsdData;
            str4 = str6;
            iIntValue = i11;
            drmInitDataCopyWithSchemeType = drmInitData3;
            unsignedShort2 = i10;
        }
        float f3 = paspFromParent;
        int i21 = i16;
        if (str == null) {
            return;
        }
        Format.Builder drmInitData4 = new Format.Builder().setId(i5).setSampleMimeType(str).setCodecs(str5).setWidth(unsignedShort).setHeight(i8).setPixelWidthHeightRatio(f3).setRotationDegrees(i6).setProjectionData(projFromParent).setStereoMode(i21).setInitializationData(listOf).setDrmInitData(drmInitData2);
        int i22 = i9;
        int i23 = i17;
        int i24 = iIsoTransferCharacteristicsToColorTransfer;
        if (i22 != -1 || i23 != -1 || i24 != -1 || byteBufferAllocateHdrStaticInfo != null) {
            drmInitData4.setColorInfo(new ColorInfo(i22, i23, i24, byteBufferAllocateHdrStaticInfo != null ? byteBufferAllocateHdrStaticInfo.array() : null));
        }
        if (esdsData != null) {
            drmInitData4.setAverageBitrate(Ints.saturatedCast(esdsData.bitrate)).setPeakBitrate(Ints.saturatedCast(esdsData.peakBitrate));
        }
        stsdData.format = drmInitData4.build();
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i2, int i3, int i4, StsdData stsdData) {
        parsableByteArray.setPosition(i3 + 16);
        if (i2 == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String nullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (nullTerminatedString != null) {
                stsdData.format = new Format.Builder().setId(i4).setSampleMimeType(nullTerminatedString).build();
            }
        }
    }

    private static Pair<long[], long[]> parseEdts(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(1701606260);
        if (leafAtomOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType.data;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[unsignedIntToInt];
        long[] jArr2 = new long[unsignedIntToInt];
        for (int i2 = 0; i2 < unsignedIntToInt; i2++) {
            jArr[i2] = fullAtomVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i2] = fullAtomVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i2) {
        parsableByteArray.setPosition(i2 + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i2, int i3, int i4, int i5, String str, boolean z, @Nullable DrmInitData drmInitData, StsdData stsdData, int i6) throws ParserException {
        int unsignedShort;
        int unsignedFixedPoint1616;
        int i7;
        int unsignedIntToInt;
        String str2;
        String str3;
        int i8;
        boolean z2;
        char c;
        int i9 = i3;
        int i10 = i4;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        parsableByteArray.setPosition(i9 + 16);
        if (z) {
            unsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            unsignedShort = 0;
        }
        if (unsignedShort == 0 || unsignedShort == 1) {
            int unsignedShort2 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            unsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 4);
            i7 = parsableByteArray.readInt();
            if (unsignedShort == 1) {
                parsableByteArray.skipBytes(16);
            }
            unsignedIntToInt = unsignedShort2;
        } else {
            if (unsignedShort != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            unsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
            unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(20);
            i7 = 0;
        }
        int position = parsableByteArray.getPosition();
        int iIntValue = i2;
        if (iIntValue == 1701733217) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i9, i10);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i6] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else if (iIntValue == 1935767394) {
            str2 = "audio/amr-wb";
        } else {
            str3 = "audio/raw";
            if (iIntValue == 1819304813 || iIntValue == 1936684916) {
                i8 = 2;
            } else if (iIntValue == 1953984371) {
                i8 = 268435456;
            } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                str2 = "audio/mpeg";
            } else if (iIntValue == 1835557169) {
                str2 = "audio/mha1";
            } else if (iIntValue == 1835560241) {
                str2 = "audio/mhm1";
            } else if (iIntValue == 1634492771) {
                str2 = "audio/alac";
            } else if (iIntValue == 1634492791) {
                str2 = "audio/g711-alaw";
            } else if (iIntValue == 1970037111) {
                str2 = "audio/g711-mlaw";
            } else if (iIntValue == 1332770163) {
                str2 = "audio/opus";
            } else if (iIntValue == 1716281667) {
                str2 = "audio/flac";
            } else if (iIntValue == 1835823201) {
                str2 = "audio/true-hd";
            } else {
                i8 = -1;
                str3 = null;
            }
            String str4 = str3;
            EsdsData esdsFromParent = null;
            String str5 = null;
            ImmutableList immutableListOf = null;
            while (position - i9 < i10) {
                parsableByteArray.setPosition(position);
                int i11 = parsableByteArray.readInt();
                ExtractorUtil.checkContainerInput(i11 > 0, "childAtomSize must be positive");
                int i12 = parsableByteArray.readInt();
                if (i12 == 1835557187) {
                    int i13 = i11 - 13;
                    byte[] bArr = new byte[i13];
                    parsableByteArray.setPosition(position + 13);
                    parsableByteArray.readBytes(bArr, 0, i13);
                    immutableListOf = ImmutableList.of(bArr);
                } else {
                    if (i12 == 1702061171 || (z && i12 == 2002876005)) {
                        int iFindBoxPosition = i12 == 1702061171 ? position : findBoxPosition(parsableByteArray, 1702061171, position, i11);
                        if (iFindBoxPosition != -1) {
                            esdsFromParent = parseEsdsFromParent(parsableByteArray, iFindBoxPosition);
                            String str6 = esdsFromParent.mimeType;
                            byte[] bArr2 = esdsFromParent.initializationData;
                            if (bArr2 != null) {
                                if ("audio/mp4a-latm".equals(str6)) {
                                    AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr2);
                                    unsignedFixedPoint1616 = audioSpecificConfig.sampleRateHz;
                                    unsignedIntToInt = audioSpecificConfig.channelCount;
                                    str5 = audioSpecificConfig.codecs;
                                }
                                immutableListOf = ImmutableList.of(bArr2);
                            }
                            str4 = str6;
                        }
                    } else {
                        if (i12 == 1684103987) {
                            parsableByteArray.setPosition(position + 8);
                            stsdData.format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i5), str, drmInitDataCopyWithSchemeType);
                        } else if (i12 == 1684366131) {
                            parsableByteArray.setPosition(position + 8);
                            stsdData.format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i5), str, drmInitDataCopyWithSchemeType);
                        } else if (i12 == 1684103988) {
                            parsableByteArray.setPosition(position + 8);
                            stsdData.format = Ac4Util.parseAc4AnnexEFormat(parsableByteArray, Integer.toString(i5), str, drmInitDataCopyWithSchemeType);
                        } else if (i12 == 1684892784) {
                            if (i7 <= 0) {
                                throw ParserException.createForMalformedContainer("Invalid sample rate for Dolby TrueHD MLP stream: " + i7, (Throwable) null);
                            }
                            unsignedFixedPoint1616 = i7;
                            c = 4;
                            unsignedIntToInt = 2;
                        } else if (i12 == 1684305011) {
                            stsdData.format = new Format.Builder().setId(i5).setSampleMimeType(str4).setChannelCount(unsignedIntToInt).setSampleRate(unsignedFixedPoint1616).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str).build();
                        } else if (i12 == 1682927731) {
                            int i14 = i11 - 8;
                            byte[] bArr3 = opusMagic;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i14);
                            parsableByteArray.setPosition(position + 8);
                            parsableByteArray.readBytes(bArrCopyOf, bArr3.length, i14);
                            immutableListOf = OpusUtil.buildInitializationData(bArrCopyOf);
                        } else if (i12 == 1684425825) {
                            byte[] bArr4 = new byte[i11 - 8];
                            bArr4[0] = 102;
                            bArr4[1] = 76;
                            bArr4[2] = 97;
                            bArr4[3] = 67;
                            parsableByteArray.setPosition(position + 12);
                            c = 4;
                            parsableByteArray.readBytes(bArr4, 4, i11 - 12);
                            immutableListOf = ImmutableList.of(bArr4);
                        } else if (i12 == 1634492771) {
                            int i15 = i11 - 12;
                            byte[] bArr5 = new byte[i15];
                            parsableByteArray.setPosition(position + 12);
                            parsableByteArray.readBytes(bArr5, 0, i15);
                            Pair alacAudioSpecificConfig = CodecSpecificDataUtil.parseAlacAudioSpecificConfig(bArr5);
                            int iIntValue2 = ((Integer) alacAudioSpecificConfig.first).intValue();
                            int iIntValue3 = ((Integer) alacAudioSpecificConfig.second).intValue();
                            immutableListOf = ImmutableList.of(bArr5);
                            unsignedFixedPoint1616 = iIntValue2;
                            unsignedIntToInt = iIntValue3;
                        } else {
                            z2 = false;
                        }
                        z2 = false;
                    }
                    position += i11;
                    i9 = i3;
                    i10 = i4;
                }
                c = 4;
                position += i11;
                i9 = i3;
                i10 = i4;
            }
            if (stsdData.format == null || str4 == null) {
            }
            Format.Builder language = new Format.Builder().setId(i5).setSampleMimeType(str4).setCodecs(str5).setChannelCount(unsignedIntToInt).setSampleRate(unsignedFixedPoint1616).setPcmEncoding(i8).setInitializationData(immutableListOf).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str);
            if (esdsFromParent != null) {
                language.setAverageBitrate(Ints.saturatedCast(esdsFromParent.bitrate)).setPeakBitrate(Ints.saturatedCast(esdsFromParent.peakBitrate));
            }
            stsdData.format = language.build();
            return;
        }
        str3 = str2;
        i8 = -1;
        String str42 = str3;
        EsdsData esdsFromParent2 = null;
        String str52 = null;
        ImmutableList immutableListOf2 = null;
        while (position - i9 < i10) {
        }
        if (stsdData.format == null) {
        }
    }

    private static int findBoxPosition(ParsableByteArray parsableByteArray, int i2, int i3, int i4) throws ParserException {
        int position = parsableByteArray.getPosition();
        ExtractorUtil.checkContainerInput(position >= i3, null);
        while (position - i3 < i4) {
            parsableByteArray.setPosition(position);
            int i5 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i5 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i2) {
                return position;
            }
            position += i5;
        }
        return -1;
    }

    private static EsdsData parseEsdsFromParent(ParsableByteArray parsableByteArray, int i2) {
        parsableByteArray.setPosition(i2 + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((unsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if ("audio/mpeg".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts.hd".equals(mimeTypeFromMp4ObjectType)) {
            return new EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int expandableClassSize = parseExpandableClassSize(parsableByteArray);
        byte[] bArr = new byte[expandableClassSize];
        parsableByteArray.readBytes(bArr, 0, expandableClassSize);
        return new EsdsData(mimeTypeFromMp4ObjectType, bArr, unsignedInt2 <= 0 ? -1L : unsignedInt2, unsignedInt <= 0 ? -1L : unsignedInt);
    }

    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i2, int i3) throws ParserException {
        Pair<Integer, TrackEncryptionBox> commonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int i4 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i4 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (commonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, i4)) != null) {
                return commonEncryptionSinfFromParent;
            }
            position += i4;
        }
        return null;
    }

    static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i2, int i3) throws ParserException {
        int i4 = i2 + 8;
        int i5 = -1;
        int i6 = 0;
        String string = null;
        Integer numValueOf = null;
        while (i4 - i2 < i3) {
            parsableByteArray.setPosition(i4);
            int i7 = parsableByteArray.readInt();
            int i8 = parsableByteArray.readInt();
            if (i8 == 1718775137) {
                numValueOf = Integer.valueOf(parsableByteArray.readInt());
            } else if (i8 == 1935894637) {
                parsableByteArray.skipBytes(4);
                string = parsableByteArray.readString(4);
            } else if (i8 == 1935894633) {
                i5 = i4;
                i6 = i7;
            }
            i4 += i7;
        }
        if (!"cenc".equals(string) && !"cbc1".equals(string) && !"cens".equals(string) && !"cbcs".equals(string)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(numValueOf != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i5 != -1, "schi atom is mandatory");
        TrackEncryptionBox schiFromParent = parseSchiFromParent(parsableByteArray, i5, i6, string);
        ExtractorUtil.checkContainerInput(schiFromParent != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (TrackEncryptionBox) Util.castNonNull(schiFromParent));
    }

    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6 = i2 + 8;
        while (true) {
            byte[] bArr = null;
            if (i6 - i2 >= i3) {
                return null;
            }
            parsableByteArray.setPosition(i6);
            int i7 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (fullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i4 = 0;
                    i5 = 0;
                } else {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    i4 = (unsignedByte & 240) >> 4;
                    i5 = unsignedByte & 15;
                }
                boolean z = parsableByteArray.readUnsignedByte() == 1;
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z && unsignedByte2 == 0) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, unsignedByte3);
                }
                return new TrackEncryptionBox(z, str, unsignedByte2, bArr2, i4, i5, bArr);
            }
            i6 += i7;
        }
    }

    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i2, int i3) {
        int i4 = i2 + 8;
        while (i4 - i2 < i3) {
            parsableByteArray.setPosition(i4);
            int i5 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i4, i5 + i4);
            }
            i4 += i5;
        }
        return null;
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = parsableByteArray.readUnsignedByte();
            i2 = (i2 << 7) | (unsignedByte & 127);
        }
        return i2;
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    private AtomParsers() {
    }

    static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) throws ParserException {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            long unsignedInt;
            int i2 = this.index + 1;
            this.index = i2;
            if (i2 == this.length) {
                return false;
            }
            if (this.chunkOffsetsAreLongs) {
                unsignedInt = this.chunkOffsets.readUnsignedLongToLong();
            } else {
                unsignedInt = this.chunkOffsets.readUnsignedInt();
            }
            this.offset = unsignedInt;
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i3 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i3;
                this.nextSamplesPerChunkChangeIndex = i3 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    static final class TkhdData {
        private final long duration;
        private final int id;
        private final int rotationDegrees;

        public TkhdData(int i2, long j, int i3) {
            this.id = i2;
            this.duration = j;
            this.rotationDegrees = i3;
        }
    }

    static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i2) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i2];
        }
    }

    static final class EsdsData {
        private final long bitrate;
        private final byte[] initializationData;
        private final String mimeType;
        private final long peakBitrate;

        public EsdsData(String str, byte[] bArr, long j, long j2) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j;
            this.peakBitrate = j2;
        }
    }

    static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Atom.LeafAtom leafAtom, Format format) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if ("audio/raw".equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (unsignedIntToInt == 0 || unsignedIntToInt % pcmFrameSize != 0) {
                    Log.w(AtomParsers.TAG, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + unsignedIntToInt);
                    unsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i2 = this.fixedSampleSize;
            return i2 == -1 ? this.data.readUnsignedIntToInt() : i2;
        }
    }

    static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & OggPageHeader.MAX_SEGMENT_COUNT;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i2 = this.fieldSize;
            if (i2 == 8) {
                return this.data.readUnsignedByte();
            }
            if (i2 == 16) {
                return this.data.readUnsignedShort();
            }
            int i3 = this.sampleIndex;
            this.sampleIndex = i3 + 1;
            if (i3 % 2 == 0) {
                int unsignedByte = this.data.readUnsignedByte();
                this.currentByte = unsignedByte;
                return (unsignedByte & 240) >> 4;
            }
            return this.currentByte & 15;
        }
    }
}
