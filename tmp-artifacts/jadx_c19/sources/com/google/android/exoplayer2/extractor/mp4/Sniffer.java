package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class Sniffer {
    public static final int BRAND_HEIC = 1751476579;
    public static final int BRAND_QUICKTIME = 1903435808;
    private static final int[] COMPATIBLE_BRANDS = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};
    private static final int SEARCH_LENGTH = 4096;

    public static boolean sniffFragmented(ExtractorInput extractorInput) throws IOException {
        return sniffInternal(extractorInput, true, false);
    }

    public static boolean sniffUnfragmented(ExtractorInput extractorInput) throws IOException {
        return sniffInternal(extractorInput, false, false);
    }

    public static boolean sniffUnfragmented(ExtractorInput extractorInput, boolean z) throws IOException {
        return sniffInternal(extractorInput, false, z);
    }

    private static boolean sniffInternal(ExtractorInput extractorInput, boolean z, boolean z2) throws IOException {
        boolean z3;
        long j;
        int i2;
        long length = extractorInput.getLength();
        long j2 = -1;
        long j3 = 4096;
        if (length != -1 && length <= 4096) {
            j3 = length;
        }
        int i3 = (int) j3;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        boolean z4 = false;
        int i4 = 0;
        boolean z5 = false;
        while (i4 < i3) {
            parsableByteArray.reset(8);
            if (!extractorInput.peekFully(parsableByteArray.getData(), z4 ? 1 : 0, 8, true)) {
                break;
            }
            long unsignedInt = parsableByteArray.readUnsignedInt();
            int i5 = parsableByteArray.readInt();
            if (unsignedInt == 1) {
                extractorInput.peekFully(parsableByteArray.getData(), 8, 8);
                i2 = 16;
                parsableByteArray.setLimit(16);
                j = parsableByteArray.readLong();
            } else {
                if (unsignedInt == 0) {
                    long length2 = extractorInput.getLength();
                    if (length2 != j2) {
                        unsignedInt = (length2 - extractorInput.getPeekPosition()) + 8;
                    }
                }
                j = unsignedInt;
                i2 = 8;
            }
            long j4 = i2;
            if (j >= j4) {
                i4 += i2;
                if (i5 != 1836019574) {
                    if (i5 != 1836019558 && i5 != 1836475768) {
                        if ((i4 + j) - j4 >= i3) {
                            break;
                        }
                        int i6 = (int) (j - j4);
                        i4 += i6;
                        if (i5 == 1718909296) {
                            if (i6 < 8) {
                                return false;
                            }
                            parsableByteArray.reset(i6);
                            extractorInput.peekFully(parsableByteArray.getData(), 0, i6);
                            int i7 = i6 / 4;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= i7) {
                                    break;
                                }
                                if (i8 == 1) {
                                    parsableByteArray.skipBytes(4);
                                } else if (isCompatibleBrand(parsableByteArray.readInt(), z2)) {
                                    z5 = true;
                                    break;
                                }
                                i8++;
                            }
                            if (!z5) {
                                return false;
                            }
                        } else if (i6 != 0) {
                            extractorInput.advancePeekPosition(i6);
                        }
                        j2 = -1;
                        z4 = false;
                    } else {
                        z3 = true;
                        break;
                    }
                } else {
                    i3 += (int) j;
                    if (length != -1 && i3 > length) {
                        i3 = (int) length;
                    }
                    j2 = -1;
                }
            } else {
                return z4;
            }
        }
        z3 = false;
        return z5 && z == z3;
    }

    private static boolean isCompatibleBrand(int i2, boolean z) {
        if ((i2 >>> 8) == 3368816) {
            return true;
        }
        if (i2 == 1751476579 && z) {
            return true;
        }
        for (int i3 : COMPATIBLE_BRANDS) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    private Sniffer() {
    }
}
