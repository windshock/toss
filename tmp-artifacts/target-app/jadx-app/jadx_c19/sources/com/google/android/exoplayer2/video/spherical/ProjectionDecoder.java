package com.google.android.exoplayer2.video.spherical;

import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.spherical.Projection;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ProjectionDecoder {
    private static final int MAX_COORDINATE_COUNT = 10000;
    private static final int MAX_TRIANGLE_INDICES = 128000;
    private static final int MAX_VERTEX_COUNT = 32000;
    private static final int TYPE_DFL8 = 1684433976;
    private static final int TYPE_MESH = 1835365224;
    private static final int TYPE_MSHP = 1836279920;
    private static final int TYPE_PROJ = 1886547818;
    private static final int TYPE_RAW = 1918990112;
    private static final int TYPE_YTMP = 2037673328;

    private static int decodeZigZag(int i2) {
        return (i2 >> 1) ^ (-(i2 & 1));
    }

    private ProjectionDecoder() {
    }

    public static Projection decode(byte[] bArr, int i2) {
        ArrayList<Projection.Mesh> proj;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        try {
            proj = isProj(parsableByteArray) ? parseProj(parsableByteArray) : parseMshp(parsableByteArray);
        } catch (ArrayIndexOutOfBoundsException unused) {
            proj = null;
        }
        if (proj == null) {
            return null;
        }
        int size = proj.size();
        if (size == 1) {
            return new Projection(proj.get(0), i2);
        }
        if (size != 2) {
            return null;
        }
        return new Projection(proj.get(0), proj.get(1), i2);
    }

    private static boolean isProj(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        int i2 = parsableByteArray.readInt();
        parsableByteArray.setPosition(0);
        return i2 == TYPE_PROJ;
    }

    private static ArrayList<Projection.Mesh> parseProj(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(8);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit) {
            int i2 = parsableByteArray.readInt() + position;
            if (i2 <= position || i2 > iLimit) {
                return null;
            }
            int i3 = parsableByteArray.readInt();
            if (i3 == TYPE_YTMP || i3 == TYPE_MSHP) {
                parsableByteArray.setLimit(i2);
                return parseMshp(parsableByteArray);
            }
            parsableByteArray.setPosition(i2);
            position = i2;
        }
        return null;
    }

    private static ArrayList<Projection.Mesh> parseMshp(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.readUnsignedByte() != 0) {
            return null;
        }
        parsableByteArray.skipBytes(7);
        int i2 = parsableByteArray.readInt();
        if (i2 == TYPE_DFL8) {
            ParsableByteArray parsableByteArray2 = new ParsableByteArray();
            Inflater inflater = new Inflater(true);
            try {
                if (!Util.inflate(parsableByteArray, parsableByteArray2, inflater)) {
                    return null;
                }
                inflater.end();
                parsableByteArray = parsableByteArray2;
            } finally {
                inflater.end();
            }
        } else if (i2 != TYPE_RAW) {
            return null;
        }
        return parseRawMshpData(parsableByteArray);
    }

    private static ArrayList<Projection.Mesh> parseRawMshpData(ParsableByteArray parsableByteArray) {
        ArrayList<Projection.Mesh> arrayList = new ArrayList<>();
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit) {
            int i2 = parsableByteArray.readInt() + position;
            if (i2 <= position || i2 > iLimit) {
                return null;
            }
            if (parsableByteArray.readInt() == TYPE_MESH) {
                Projection.Mesh mesh = parseMesh(parsableByteArray);
                if (mesh == null) {
                    return null;
                }
                arrayList.add(mesh);
            }
            parsableByteArray.setPosition(i2);
            position = i2;
        }
        return arrayList;
    }

    private static Projection.Mesh parseMesh(ParsableByteArray parsableByteArray) {
        int i2 = parsableByteArray.readInt();
        Projection.Mesh mesh = null;
        if (i2 > 10000) {
            return null;
        }
        float[] fArr = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr[i3] = parsableByteArray.readFloat();
        }
        int i4 = parsableByteArray.readInt();
        if (i4 > MAX_VERTEX_COUNT) {
            return null;
        }
        double d = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(i2 * 2.0d) / dLog);
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() << 3);
        float[] fArr2 = new float[i4 * 5];
        int i5 = 5;
        int[] iArr = new int[5];
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            int i8 = 0;
            while (i8 < i5) {
                int iDecodeZigZag = iArr[i8] + decodeZigZag(parsableBitArray.readBits(iCeil));
                if (iDecodeZigZag >= i2 || iDecodeZigZag < 0) {
                    return null;
                }
                fArr2[i7] = fArr[iDecodeZigZag];
                iArr[i8] = iDecodeZigZag;
                i8++;
                i7++;
                i5 = 5;
            }
            i6++;
            i5 = 5;
        }
        parsableBitArray.setPosition((parsableBitArray.getPosition() + 7) & (-8));
        int i9 = 32;
        int bits = parsableBitArray.readBits(32);
        Projection.SubMesh[] subMeshArr = new Projection.SubMesh[bits];
        int i10 = 0;
        while (i10 < bits) {
            int bits2 = parsableBitArray.readBits(8);
            int bits3 = parsableBitArray.readBits(8);
            int bits4 = parsableBitArray.readBits(i9);
            if (bits4 > MAX_TRIANGLE_INDICES) {
                return mesh;
            }
            int i11 = bits;
            int iCeil2 = (int) Math.ceil(Math.log(i4 * d) / dLog);
            float[] fArr3 = new float[bits4 * 3];
            float[] fArr4 = new float[bits4 << 1];
            int i12 = 0;
            int i13 = 0;
            while (i12 < bits4) {
                int iDecodeZigZag2 = i13 + decodeZigZag(parsableBitArray.readBits(iCeil2));
                if (iDecodeZigZag2 < 0 || iDecodeZigZag2 >= i4) {
                    return null;
                }
                int i14 = i12 * 3;
                int i15 = iDecodeZigZag2 * 5;
                fArr3[i14] = fArr2[i15];
                fArr3[i14 + 1] = fArr2[i15 + 1];
                fArr3[i14 + 2] = fArr2[i15 + 2];
                int i16 = i12 << 1;
                fArr4[i16] = fArr2[i15 + 3];
                fArr4[i16 + 1] = fArr2[i15 + 4];
                i12++;
                i13 = iDecodeZigZag2;
                mesh = null;
            }
            subMeshArr[i10] = new Projection.SubMesh(bits2, fArr3, fArr4, bits3);
            i10++;
            mesh = mesh;
            bits = i11;
            i9 = 32;
            d = 2.0d;
        }
        return new Projection.Mesh(subMeshArr);
    }
}
