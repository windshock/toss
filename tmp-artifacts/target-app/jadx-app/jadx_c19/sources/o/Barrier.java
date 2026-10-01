package o;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Barrier {
    private static final AtomicReference<byte[]> IAuthTabCallback = new AtomicReference<>();

    public static ByteBuffer onExtraCallbackWithResult(@NonNull File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                channel = randomAccessFile.getChannel();
                MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return mappedByteBufferLoad;
            } catch (Throwable th) {
                th = th;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static void onExtraCallbackWithResult(@NonNull ByteBuffer byteBuffer, @NonNull File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        onWarmupCompleted(byteBuffer);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    channel.write(byteBuffer);
                    channel.force(false);
                    channel.close();
                    randomAccessFile.close();
                    try {
                        channel.close();
                    } catch (IOException unused) {
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                } catch (Throwable th) {
                    th = th;
                    fileChannel = channel;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                            throw th;
                        } catch (IOException unused4) {
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    public static byte[] onExtraCallback(@NonNull ByteBuffer byteBuffer) {
        onExtraCallback onextracallbackIAuthTabCallback = IAuthTabCallback(byteBuffer);
        if (onextracallbackIAuthTabCallback != null && onextracallbackIAuthTabCallback.IAuthTabCallback == 0 && onextracallbackIAuthTabCallback.onNavigationEvent == onextracallbackIAuthTabCallback.onExtraCallbackWithResult.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        onWarmupCompleted(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static InputStream onNavigationEvent(@NonNull ByteBuffer byteBuffer) {
        return new onNavigationEvent(byteBuffer);
    }

    public static ByteBuffer onExtraCallback(@NonNull InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = IAuthTabCallback.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i2 = inputStream.read(andSet);
            if (i2 >= 0) {
                byteArrayOutputStream.write(andSet, 0, i2);
            } else {
                IAuthTabCallback.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return onWarmupCompleted(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
        }
    }

    public static ByteBuffer onWarmupCompleted(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    private static onExtraCallback IAuthTabCallback(@NonNull ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new onExtraCallback(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    static final class onExtraCallback {
        final int IAuthTabCallback;
        final byte[] onExtraCallbackWithResult;
        final int onNavigationEvent;

        onExtraCallback(@NonNull byte[] bArr, int i2, int i3) {
            this.onExtraCallbackWithResult = bArr;
            this.IAuthTabCallback = i2;
            this.onNavigationEvent = i3;
        }
    }

    static class onNavigationEvent extends InputStream {
        private final ByteBuffer IAuthTabCallback;
        private int onExtraCallbackWithResult = -1;

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        onNavigationEvent(@NonNull ByteBuffer byteBuffer) {
            this.IAuthTabCallback = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.IAuthTabCallback.remaining();
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.IAuthTabCallback.hasRemaining()) {
                return this.IAuthTabCallback.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public void mark(int i2) {
            synchronized (this) {
                this.onExtraCallbackWithResult = this.IAuthTabCallback.position();
            }
        }

        @Override // java.io.InputStream
        public int read(@NonNull byte[] bArr, int i2, int i3) {
            if (!this.IAuthTabCallback.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i3, available());
            this.IAuthTabCallback.get(bArr, i2, iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            synchronized (this) {
                int i2 = this.onExtraCallbackWithResult;
                if (i2 == -1) {
                    throw new IOException("Cannot reset to unset mark position");
                }
                this.IAuthTabCallback.position(i2);
            }
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (!this.IAuthTabCallback.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j, available());
            this.IAuthTabCallback.position((int) (r0.position() + jMin));
            return jMin;
        }
    }
}
