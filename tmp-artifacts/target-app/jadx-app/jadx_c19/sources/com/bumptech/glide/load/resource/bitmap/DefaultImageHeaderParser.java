package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.annotation.NonNull;
import com.alibaba.griver.base.common.utils.HexStringUtil;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import o.Savers_androidKtExternalSyntheticLambda6;
import o.markHierarchyDirty;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {
    static final byte[] onExtraCallback = "Exif\u0000\u0000".getBytes(Charset.forName(HexStringUtil.DEFAULT_CHARSET_NAME));
    private static final int[] IAuthTabCallback = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static int IAuthTabCallback(int i2, int i3) {
        return i2 + 2 + (i3 * 12);
    }

    private static boolean onExtraCallbackWithResult(int i2) {
        return (i2 & 65496) == 65496 || i2 == 19789 || i2 == 18761;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType onWarmupCompleted(@NonNull InputStream inputStream) throws IOException {
        return onExtraCallbackWithResult(new onExtraCallbackWithResult((InputStream) markHierarchyDirty.onExtraCallbackWithResult(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType onWarmupCompleted(@NonNull ByteBuffer byteBuffer) throws IOException {
        return onExtraCallbackWithResult(new onWarmupCompleted((ByteBuffer) markHierarchyDirty.onExtraCallbackWithResult(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int IAuthTabCallback(@NonNull InputStream inputStream, @NonNull Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) throws IOException {
        return IAuthTabCallback(new onExtraCallbackWithResult((InputStream) markHierarchyDirty.onExtraCallbackWithResult(inputStream)), (Savers_androidKtExternalSyntheticLambda6) markHierarchyDirty.onExtraCallbackWithResult(savers_androidKtExternalSyntheticLambda6));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int onWarmupCompleted(@NonNull ByteBuffer byteBuffer, @NonNull Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) throws IOException {
        return IAuthTabCallback(new onWarmupCompleted((ByteBuffer) markHierarchyDirty.onExtraCallbackWithResult(byteBuffer)), (Savers_androidKtExternalSyntheticLambda6) markHierarchyDirty.onExtraCallbackWithResult(savers_androidKtExternalSyntheticLambda6));
    }

    private ImageHeaderParser.ImageType onExtraCallbackWithResult(Reader reader) throws IOException {
        try {
            int iOnNavigationEvent = reader.onNavigationEvent();
            if (iOnNavigationEvent == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iOnExtraCallback = (iOnNavigationEvent << 8) | reader.onExtraCallback();
            if (iOnExtraCallback == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iOnExtraCallback2 = (iOnExtraCallback << 8) | reader.onExtraCallback();
            if (iOnExtraCallback2 == -1991225785) {
                reader.onWarmupCompleted(21L);
                try {
                    return reader.onExtraCallback() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iOnExtraCallback2 != 1380533830) {
                return onExtraCallbackWithResult(reader, iOnExtraCallback2) ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
            }
            reader.onWarmupCompleted(4L);
            if (((reader.onNavigationEvent() << 16) | reader.onNavigationEvent()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iOnNavigationEvent2 = (reader.onNavigationEvent() << 16) | reader.onNavigationEvent();
            if ((iOnNavigationEvent2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i2 = iOnNavigationEvent2 & OggPageHeader.MAX_SEGMENT_COUNT;
            if (i2 != 88) {
                if (i2 == 76) {
                    reader.onWarmupCompleted(4L);
                    return (reader.onExtraCallback() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                return ImageHeaderParser.ImageType.WEBP;
            }
            reader.onWarmupCompleted(4L);
            short sOnExtraCallback = reader.onExtraCallback();
            if ((sOnExtraCallback & 2) != 0) {
                return ImageHeaderParser.ImageType.ANIMATED_WEBP;
            }
            if ((sOnExtraCallback & 16) != 0) {
                return ImageHeaderParser.ImageType.WEBP_A;
            }
            return ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private boolean onExtraCallbackWithResult(Reader reader, int i2) throws IOException {
        if (((reader.onNavigationEvent() << 16) | reader.onNavigationEvent()) != 1718909296) {
            return false;
        }
        int iOnNavigationEvent = (reader.onNavigationEvent() << 16) | reader.onNavigationEvent();
        if (iOnNavigationEvent == 1635150182 || iOnNavigationEvent == 1635150195) {
            return true;
        }
        reader.onWarmupCompleted(4L);
        int i3 = i2 - 16;
        if (i3 % 4 != 0) {
            return false;
        }
        int i4 = 0;
        while (i4 < 5 && i3 > 0) {
            int iOnNavigationEvent2 = (reader.onNavigationEvent() << 16) | reader.onNavigationEvent();
            if (iOnNavigationEvent2 == 1635150182 || iOnNavigationEvent2 == 1635150195) {
                return true;
            }
            i4++;
            i3 -= 4;
        }
        return false;
    }

    private int IAuthTabCallback(Reader reader, Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) throws IOException {
        try {
            if (!onExtraCallbackWithResult(reader.onNavigationEvent())) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int iIAuthTabCallback = IAuthTabCallback(reader);
            if (iIAuthTabCallback == -1) {
                return -1;
            }
            byte[] bArr = (byte[]) savers_androidKtExternalSyntheticLambda6.onExtraCallback(iIAuthTabCallback, byte[].class);
            try {
                return onExtraCallback(reader, bArr, iIAuthTabCallback);
            } finally {
                savers_androidKtExternalSyntheticLambda6.onNavigationEvent((Savers_androidKtExternalSyntheticLambda6) bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    private int onExtraCallback(Reader reader, byte[] bArr, int i2) throws IOException {
        if (reader.onExtraCallbackWithResult(bArr, i2) != i2) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        if (onExtraCallback(bArr, i2)) {
            return onNavigationEvent(new onExtraCallback(bArr, i2));
        }
        return -1;
    }

    private boolean onExtraCallback(byte[] bArr, int i2) {
        boolean z = bArr != null && i2 > onExtraCallback.length;
        if (z) {
            int i3 = 0;
            while (true) {
                byte[] bArr2 = onExtraCallback;
                if (i3 >= bArr2.length) {
                    break;
                }
                if (bArr[i3] != bArr2[i3]) {
                    return false;
                }
                i3++;
            }
        }
        return z;
    }

    private int IAuthTabCallback(Reader reader) throws IOException {
        while (reader.onExtraCallback() == 255) {
            short sOnExtraCallback = reader.onExtraCallback();
            if (sOnExtraCallback == 218 || sOnExtraCallback == 217) {
                return -1;
            }
            int iOnNavigationEvent = reader.onNavigationEvent() - 2;
            if (sOnExtraCallback == 225) {
                return iOnNavigationEvent;
            }
            long j = iOnNavigationEvent;
            if (reader.onWarmupCompleted(j) != j) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    private static int onNavigationEvent(onExtraCallback onextracallback) {
        ByteOrder byteOrder;
        short sOnNavigationEvent = onextracallback.onNavigationEvent(6);
        if (sOnNavigationEvent == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (sOnNavigationEvent == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            Log.isLoggable("DfltImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        onextracallback.IAuthTabCallback(byteOrder);
        int iOnExtraCallback = onextracallback.onExtraCallback(10) + 6;
        short sOnNavigationEvent2 = onextracallback.onNavigationEvent(iOnExtraCallback);
        for (int i2 = 0; i2 < sOnNavigationEvent2; i2++) {
            int iIAuthTabCallback = IAuthTabCallback(iOnExtraCallback, i2);
            if (onextracallback.onNavigationEvent(iIAuthTabCallback) == 274) {
                short sOnNavigationEvent3 = onextracallback.onNavigationEvent(iIAuthTabCallback + 2);
                if (sOnNavigationEvent3 <= 0 || sOnNavigationEvent3 > 12) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    int iOnExtraCallback2 = onextracallback.onExtraCallback(iIAuthTabCallback + 4);
                    if (iOnExtraCallback2 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        int i3 = iOnExtraCallback2 + IAuthTabCallback[sOnNavigationEvent3];
                        if (i3 > 4) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            int i4 = iIAuthTabCallback + 8;
                            if (i4 < 0 || i4 > onextracallback.onExtraCallback()) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else if (i3 < 0 || i3 + i4 > onextracallback.onExtraCallback()) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                return onextracallback.onNavigationEvent(i4);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    static final class onExtraCallback {
        private final ByteBuffer onExtraCallback;

        onExtraCallback(byte[] bArr, int i2) {
            this.onExtraCallback = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i2);
        }

        void IAuthTabCallback(ByteOrder byteOrder) {
            this.onExtraCallback.order(byteOrder);
        }

        int onExtraCallback() {
            return this.onExtraCallback.remaining();
        }

        int onExtraCallback(int i2) {
            if (onWarmupCompleted(i2, 4)) {
                return this.onExtraCallback.getInt(i2);
            }
            return -1;
        }

        short onNavigationEvent(int i2) {
            if (onWarmupCompleted(i2, 2)) {
                return this.onExtraCallback.getShort(i2);
            }
            return (short) -1;
        }

        private boolean onWarmupCompleted(int i2, int i3) {
            return this.onExtraCallback.remaining() - i2 >= i3;
        }
    }

    interface Reader {
        short onExtraCallback() throws IOException;

        int onExtraCallbackWithResult(byte[] bArr, int i2) throws IOException;

        int onNavigationEvent() throws IOException;

        long onWarmupCompleted(long j) throws IOException;

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }
    }

    static final class onWarmupCompleted implements Reader {
        private final ByteBuffer IAuthTabCallback;

        onWarmupCompleted(ByteBuffer byteBuffer) {
            this.IAuthTabCallback = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short onExtraCallback() throws Reader.EndOfFileException {
            if (this.IAuthTabCallback.remaining() <= 0) {
                throw new Reader.EndOfFileException();
            }
            return (short) (this.IAuthTabCallback.get() & 255);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int onNavigationEvent() throws Reader.EndOfFileException {
            return (onExtraCallback() << 8) | onExtraCallback();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int onExtraCallbackWithResult(byte[] bArr, int i2) {
            int iMin = Math.min(i2, this.IAuthTabCallback.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.IAuthTabCallback.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long onWarmupCompleted(long j) {
            int iMin = (int) Math.min(this.IAuthTabCallback.remaining(), j);
            ByteBuffer byteBuffer = this.IAuthTabCallback;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    static final class onExtraCallbackWithResult implements Reader {
        private final InputStream onExtraCallbackWithResult;

        onExtraCallbackWithResult(InputStream inputStream) {
            this.onExtraCallbackWithResult = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short onExtraCallback() throws IOException {
            int i2 = this.onExtraCallbackWithResult.read();
            if (i2 != -1) {
                return (short) i2;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int onNavigationEvent() throws IOException {
            return (onExtraCallback() << 8) | onExtraCallback();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int onExtraCallbackWithResult(byte[] bArr, int i2) throws IOException {
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2 && (i3 = this.onExtraCallbackWithResult.read(bArr, i4, i2 - i4)) != -1) {
                i4 += i3;
            }
            if (i4 == 0 && i3 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i4;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long onWarmupCompleted(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long jSkip = this.onExtraCallbackWithResult.skip(j2);
                if (jSkip <= 0) {
                    if (this.onExtraCallbackWithResult.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j2 -= jSkip;
            }
            return j - j2;
        }
    }
}
