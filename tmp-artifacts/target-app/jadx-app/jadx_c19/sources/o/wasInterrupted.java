package o;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import o.SaversKtExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class wasInterrupted<T> implements ResourceDecoder<T, Bitmap> {
    private final Savers_androidKtExternalSyntheticLambda5 IAuthTabCallback;
    private final onNavigationEvent<T> IAuthTabCallbackStub;
    private final onExtraCallback onExtraCallback;
    public static final SaversKtExternalSyntheticLambda3<Long> onWarmupCompleted = SaversKtExternalSyntheticLambda3.onExtraCallbackWithResult("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new SaversKtExternalSyntheticLambda3.IAuthTabCallback<Long>() { // from class: o.wasInterrupted.3
        private final ByteBuffer IAuthTabCallback = ByteBuffer.allocate(8);

        @Override // o.SaversKtExternalSyntheticLambda3.IAuthTabCallback
        public void onNavigationEvent(@NonNull byte[] bArr, @NonNull Long l, @NonNull MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.IAuthTabCallback) {
                this.IAuthTabCallback.position(0);
                messageDigest.update(this.IAuthTabCallback.putLong(l.longValue()).array());
            }
        }
    });
    public static final SaversKtExternalSyntheticLambda3<Integer> onExtraCallbackWithResult = SaversKtExternalSyntheticLambda3.onExtraCallbackWithResult("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new SaversKtExternalSyntheticLambda3.IAuthTabCallback<Integer>() { // from class: o.wasInterrupted.1
        private final ByteBuffer onWarmupCompleted = ByteBuffer.allocate(4);

        @Override // o.SaversKtExternalSyntheticLambda3.IAuthTabCallback
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public void onNavigationEvent(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.onWarmupCompleted) {
                this.onWarmupCompleted.position(0);
                messageDigest.update(this.onWarmupCompleted.putInt(num.intValue()).array());
            }
        }
    });
    private static final onExtraCallback onNavigationEvent = new onExtraCallback();

    interface onNavigationEvent<T> {
        void IAuthTabCallback(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean IAuthTabCallback(@NonNull T t, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return true;
    }

    public static ResourceDecoder<AssetFileDescriptor, Bitmap> onNavigationEvent(Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5) {
        return new wasInterrupted(savers_androidKtExternalSyntheticLambda5, new onExtraCallbackWithResult());
    }

    public static ResourceDecoder<ParcelFileDescriptor, Bitmap> onExtraCallbackWithResult(Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5) {
        return new wasInterrupted(savers_androidKtExternalSyntheticLambda5, new IAuthTabCallback());
    }

    public static ResourceDecoder<ByteBuffer, Bitmap> onExtraCallback(Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5) {
        return new wasInterrupted(savers_androidKtExternalSyntheticLambda5, new onWarmupCompleted());
    }

    wasInterrupted(Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, onNavigationEvent<T> onnavigationevent) {
        this(savers_androidKtExternalSyntheticLambda5, onnavigationevent, onNavigationEvent);
    }

    wasInterrupted(Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, onNavigationEvent<T> onnavigationevent, onExtraCallback onextracallback) {
        this.IAuthTabCallback = savers_androidKtExternalSyntheticLambda5;
        this.IAuthTabCallbackStub = onnavigationevent;
        this.onExtraCallback = onextracallback;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public Resource<Bitmap> onNavigationEvent(@NonNull T t, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
        long jLongValue = ((Long) saversKtExternalSyntheticLambda30.IAuthTabCallback(onWarmupCompleted)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) saversKtExternalSyntheticLambda30.IAuthTabCallback(onExtraCallbackWithResult);
        if (num == null) {
            num = 2;
        }
        AbstractResolvableFuture abstractResolvableFuture = (AbstractResolvableFuture) saversKtExternalSyntheticLambda30.IAuthTabCallback(AbstractResolvableFuture.asBinder);
        if (abstractResolvableFuture == null) {
            abstractResolvableFuture = AbstractResolvableFuture.onExtraCallbackWithResult;
        }
        AbstractResolvableFuture abstractResolvableFuture2 = abstractResolvableFuture;
        MediaMetadataRetriever mediaMetadataRetrieverIAuthTabCallback = this.onExtraCallback.IAuthTabCallback();
        try {
            this.IAuthTabCallbackStub.IAuthTabCallback(mediaMetadataRetrieverIAuthTabCallback, t);
            return setUpdateBlock.onWarmupCompleted(onExtraCallbackWithResult(mediaMetadataRetrieverIAuthTabCallback, jLongValue, num.intValue(), i2, i3, abstractResolvableFuture2), this.IAuthTabCallback);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                ICustomTabsCallbackStubProxy.onExtraCallbackWithResult(mediaMetadataRetrieverIAuthTabCallback);
            } else {
                mediaMetadataRetrieverIAuthTabCallback.release();
            }
        }
    }

    private static Bitmap onExtraCallbackWithResult(MediaMetadataRetriever mediaMetadataRetriever, long j, int i2, int i3, int i4, AbstractResolvableFuture abstractResolvableFuture) {
        Bitmap bitmapOnNavigationEvent = (Build.VERSION.SDK_INT < 27 || i3 == Integer.MIN_VALUE || i4 == Integer.MIN_VALUE || abstractResolvableFuture == AbstractResolvableFuture.IAuthTabCallbackDefault) ? null : onNavigationEvent(mediaMetadataRetriever, j, i2, i3, i4, abstractResolvableFuture);
        if (bitmapOnNavigationEvent == null) {
            bitmapOnNavigationEvent = IAuthTabCallback(mediaMetadataRetriever, j, i2);
        }
        if (bitmapOnNavigationEvent != null) {
            return bitmapOnNavigationEvent;
        }
        throw new IAuthTabCallbackStub();
    }

    private static Bitmap onNavigationEvent(MediaMetadataRetriever mediaMetadataRetriever, long j, int i2, int i3, int i4, AbstractResolvableFuture abstractResolvableFuture) {
        try {
            int i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i7 == 90 || i7 == 270) {
                i6 = i5;
                i5 = i6;
            }
            float fOnExtraCallback = abstractResolvableFuture.onExtraCallback(i5, i6, i3, i4);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i2, Math.round(i5 * fOnExtraCallback), Math.round(fOnExtraCallback * i6));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Bitmap IAuthTabCallback(MediaMetadataRetriever mediaMetadataRetriever, long j, int i2) {
        return mediaMetadataRetriever.getFrameAtTime(j, i2);
    }

    static class onExtraCallback {
        onExtraCallback() {
        }

        public MediaMetadataRetriever IAuthTabCallback() {
            return new MediaMetadataRetriever();
        }
    }

    static final class onExtraCallbackWithResult implements onNavigationEvent<AssetFileDescriptor> {
        private onExtraCallbackWithResult() {
        }

        @Override // o.wasInterrupted.onNavigationEvent
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public void IAuthTabCallback(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    static final class IAuthTabCallback implements onNavigationEvent<ParcelFileDescriptor> {
        IAuthTabCallback() {
        }

        @Override // o.wasInterrupted.onNavigationEvent
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public void IAuthTabCallback(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    static final class onWarmupCompleted implements onNavigationEvent<ByteBuffer> {
        onWarmupCompleted() {
        }

        @Override // o.wasInterrupted.onNavigationEvent
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public void IAuthTabCallback(MediaMetadataRetriever mediaMetadataRetriever, final ByteBuffer byteBuffer) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(new MediaDataSource() { // from class: o.wasInterrupted.onWarmupCompleted.1
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                }

                @Override // android.media.MediaDataSource
                public int readAt(long j, byte[] bArr, int i2, int i3) {
                    if (j >= byteBuffer.limit()) {
                        return -1;
                    }
                    byteBuffer.position((int) j);
                    int iMin = Math.min(i3, byteBuffer.remaining());
                    byteBuffer.get(bArr, i2, iMin);
                    return iMin;
                }

                @Override // android.media.MediaDataSource
                public long getSize() {
                    return byteBuffer.limit();
                }
            });
        }
    }

    static final class IAuthTabCallbackStub extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        IAuthTabCallbackStub() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }
}
