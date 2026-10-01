package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class UploadDataProviders {

    interface onNavigationEvent {
        FileChannel IAuthTabCallback() throws IOException;
    }

    public static UploadDataProvider create(final File file) {
        return new onExtraCallbackWithResult(new onNavigationEvent() { // from class: org.chromium.net.UploadDataProviders.5
            @Override // org.chromium.net.UploadDataProviders.onNavigationEvent
            public FileChannel IAuthTabCallback() throws IOException {
                return new FileInputStream(file).getChannel();
            }
        });
    }

    public static UploadDataProvider create(final ParcelFileDescriptor parcelFileDescriptor) {
        return new onExtraCallbackWithResult(new onNavigationEvent() { // from class: org.chromium.net.UploadDataProviders.2
            @Override // org.chromium.net.UploadDataProviders.onNavigationEvent
            public FileChannel IAuthTabCallback() throws IOException {
                if (parcelFileDescriptor.getStatSize() != -1) {
                    return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
                }
                parcelFileDescriptor.close();
                throw new IllegalArgumentException("Not a file: " + parcelFileDescriptor);
            }
        });
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new onExtraCallback(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new onExtraCallback(ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }

    static final class onExtraCallbackWithResult extends UploadDataProvider {
        private volatile FileChannel IAuthTabCallback;
        private final onNavigationEvent onExtraCallback;
        private final Object onWarmupCompleted;

        private onExtraCallbackWithResult(onNavigationEvent onnavigationevent) {
            this.onWarmupCompleted = new Object();
            this.onExtraCallback = onnavigationevent;
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() throws IOException {
            return IAuthTabCallback().size();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            FileChannel fileChannelIAuthTabCallback = IAuthTabCallback();
            int i = 0;
            while (i == 0) {
                int i2 = fileChannelIAuthTabCallback.read(byteBuffer);
                if (i2 == -1) {
                    break;
                } else {
                    i += i2;
                }
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) throws IOException {
            IAuthTabCallback().position(0L);
            uploadDataSink.onRewindSucceeded();
        }

        private FileChannel IAuthTabCallback() throws IOException {
            if (this.IAuthTabCallback == null) {
                synchronized (this.onWarmupCompleted) {
                    if (this.IAuthTabCallback == null) {
                        this.IAuthTabCallback = this.onExtraCallback.IAuthTabCallback();
                    }
                }
            }
            return this.IAuthTabCallback;
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            FileChannel fileChannel = this.IAuthTabCallback;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }
    }

    static final class onExtraCallback extends UploadDataProvider {
        private final ByteBuffer onExtraCallbackWithResult;

        private onExtraCallback(ByteBuffer byteBuffer) {
            this.onExtraCallbackWithResult = byteBuffer;
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return this.onExtraCallbackWithResult.limit();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            if (byteBuffer.remaining() >= this.onExtraCallbackWithResult.remaining()) {
                byteBuffer.put(this.onExtraCallbackWithResult);
            } else {
                int iLimit = this.onExtraCallbackWithResult.limit();
                ByteBuffer byteBuffer2 = this.onExtraCallbackWithResult;
                byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
                byteBuffer.put(this.onExtraCallbackWithResult);
                this.onExtraCallbackWithResult.limit(iLimit);
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            this.onExtraCallbackWithResult.position(0);
            uploadDataSink.onRewindSucceeded();
        }
    }

    private UploadDataProviders() {
    }
}
