package com.google.android.play.core.assetpacks.internal;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class am {
    public static long a(an anVar, InputStream inputStream, OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int i2 = dataInputStream.readInt();
        if (i2 != -771763713) {
            throw new al("Unexpected magic=".concat(String.format("%x", Integer.valueOf(i2))));
        }
        int i3 = dataInputStream.read();
        if (i3 != 4) {
            throw new al("Unexpected version=" + i3);
        }
        long j2 = 0;
        while (true) {
            long j3 = j - j2;
            try {
                int unsignedShort = dataInputStream.read();
                if (unsignedShort == -1) {
                    throw new IOException("Patch file overrun");
                }
                if (unsignedShort == 0) {
                    return j2;
                }
                switch (unsignedShort) {
                    case 247:
                        unsignedShort = dataInputStream.readUnsignedShort();
                        c(bArr, dataInputStream, outputStream, unsignedShort, j3);
                        break;
                    case 248:
                        unsignedShort = dataInputStream.readInt();
                        c(bArr, dataInputStream, outputStream, unsignedShort, j3);
                        break;
                    case 249:
                        long unsignedShort2 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.read();
                        if (unsignedShort == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        b(bArr, anVar, outputStream, unsignedShort2, unsignedShort, j3);
                        break;
                    case 250:
                        long unsignedShort3 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        b(bArr, anVar, outputStream, unsignedShort3, unsignedShort, j3);
                        break;
                    case 251:
                        long unsignedShort4 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readInt();
                        b(bArr, anVar, outputStream, unsignedShort4, unsignedShort, j3);
                        break;
                    case 252:
                        long j4 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.read();
                        if (unsignedShort == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        b(bArr, anVar, outputStream, j4, unsignedShort, j3);
                        break;
                    case 253:
                        long j5 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        b(bArr, anVar, outputStream, j5, unsignedShort, j3);
                        break;
                    case 254:
                        long j6 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readInt();
                        b(bArr, anVar, outputStream, j6, unsignedShort, j3);
                        break;
                    case OggPageHeader.MAX_SEGMENT_COUNT /* 255 */:
                        long j7 = dataInputStream.readLong();
                        unsignedShort = dataInputStream.readInt();
                        b(bArr, anVar, outputStream, j7, unsignedShort, j3);
                        break;
                    default:
                        c(bArr, dataInputStream, outputStream, unsignedShort, j3);
                        break;
                }
                j2 += unsignedShort;
            } finally {
                outputStream.flush();
            }
        }
    }

    private static void b(byte[] bArr, an anVar, OutputStream outputStream, long j, int i2, long j2) throws IOException {
        if (i2 < 0) {
            throw new IOException("copyLength negative");
        }
        if (j < 0) {
            throw new IOException("inputOffset negative");
        }
        long j3 = i2;
        if (j3 > j2) {
            throw new IOException("Output length overrun");
        }
        try {
            InputStream inputStreamC = new ao(anVar, j, j3, false).c();
            while (i2 > 0) {
                try {
                    int iMin = Math.min(i2, 16384);
                    int i3 = 0;
                    while (i3 < iMin) {
                        int i4 = inputStreamC.read(bArr, i3, iMin - i3);
                        if (i4 == -1) {
                            throw new IOException("truncated input stream");
                        }
                        i3 += i4;
                    }
                    outputStream.write(bArr, 0, iMin);
                    i2 -= iMin;
                } finally {
                }
            }
            inputStreamC.close();
        } catch (EOFException e) {
            throw new IOException("patch underrun", e);
        }
    }

    private static void c(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i2, long j) throws IOException {
        if (i2 < 0) {
            throw new IOException("copyLength negative");
        }
        if (i2 > j) {
            throw new IOException("Output length overrun");
        }
        while (i2 > 0) {
            try {
                int iMin = Math.min(i2, 16384);
                dataInputStream.readFully(bArr, 0, iMin);
                outputStream.write(bArr, 0, iMin);
                i2 -= iMin;
            } catch (EOFException unused) {
                throw new IOException("patch underrun");
            }
        }
    }
}
