package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda22 {

    interface IAuthTabCallback {
        int onExtraCallback(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    interface onExtraCallback {
        ImageHeaderParser.ImageType onExtraCallbackWithResult(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    public static ImageHeaderParser.ImageType IAuthTabCallback(@NonNull List<ImageHeaderParser> list, @Nullable final InputStream inputStream, @NonNull Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, savers_androidKtExternalSyntheticLambda6);
        }
        inputStream.mark(5242880);
        return onNavigationEvent(list, new onExtraCallback() { // from class: o.SaversKtExternalSyntheticLambda22.3
            @Override // o.SaversKtExternalSyntheticLambda22.onExtraCallback
            public ImageHeaderParser.ImageType onExtraCallbackWithResult(ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.onWarmupCompleted(inputStream);
                } finally {
                    inputStream.reset();
                }
            }
        });
    }

    public static ImageHeaderParser.ImageType IAuthTabCallback(@NonNull List<ImageHeaderParser> list, @Nullable final ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return onNavigationEvent(list, new onExtraCallback() { // from class: o.SaversKtExternalSyntheticLambda22.1
            @Override // o.SaversKtExternalSyntheticLambda22.onExtraCallback
            public ImageHeaderParser.ImageType onExtraCallbackWithResult(ImageHeaderParser imageHeaderParser) throws IOException {
                return imageHeaderParser.onWarmupCompleted(byteBuffer);
            }
        });
    }

    public static ImageHeaderParser.ImageType onExtraCallback(@NonNull List<ImageHeaderParser> list, @NonNull final ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull final Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) throws IOException {
        return onNavigationEvent(list, new onExtraCallback() { // from class: o.SaversKtExternalSyntheticLambda22.4
            @Override // o.SaversKtExternalSyntheticLambda22.onExtraCallback
            public ImageHeaderParser.ImageType onExtraCallbackWithResult(ImageHeaderParser imageHeaderParser) throws Throwable {
                RecyclableBufferedInputStream recyclableBufferedInputStream;
                try {
                    recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(parcelFileDescriptorRewinder.onNavigationEvent().getFileDescriptor()), savers_androidKtExternalSyntheticLambda6);
                    try {
                        ImageHeaderParser.ImageType imageTypeOnWarmupCompleted = imageHeaderParser.onWarmupCompleted(recyclableBufferedInputStream);
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused) {
                        }
                        parcelFileDescriptorRewinder.onNavigationEvent();
                        return imageTypeOnWarmupCompleted;
                    } catch (Throwable th) {
                        th = th;
                        if (recyclableBufferedInputStream != null) {
                            try {
                                recyclableBufferedInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        parcelFileDescriptorRewinder.onNavigationEvent();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    recyclableBufferedInputStream = null;
                }
            }
        });
    }

    private static ImageHeaderParser.ImageType onNavigationEvent(@NonNull List<ImageHeaderParser> list, onExtraCallback onextracallback) throws IOException {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ImageHeaderParser.ImageType imageTypeOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult(list.get(i2));
            if (imageTypeOnExtraCallbackWithResult != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeOnExtraCallbackWithResult;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static int IAuthTabCallback(@NonNull List<ImageHeaderParser> list, @Nullable final ByteBuffer byteBuffer, @NonNull final Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return onWarmupCompleted(list, new IAuthTabCallback() { // from class: o.SaversKtExternalSyntheticLambda22.5
            @Override // o.SaversKtExternalSyntheticLambda22.IAuthTabCallback
            public int onExtraCallback(ImageHeaderParser imageHeaderParser) throws IOException {
                return imageHeaderParser.onWarmupCompleted(byteBuffer, savers_androidKtExternalSyntheticLambda6);
            }
        });
    }

    public static int onNavigationEvent(@NonNull List<ImageHeaderParser> list, @Nullable final InputStream inputStream, @NonNull final Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, savers_androidKtExternalSyntheticLambda6);
        }
        inputStream.mark(5242880);
        return onWarmupCompleted(list, new IAuthTabCallback() { // from class: o.SaversKtExternalSyntheticLambda22.2
            @Override // o.SaversKtExternalSyntheticLambda22.IAuthTabCallback
            public int onExtraCallback(ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.IAuthTabCallback(inputStream, savers_androidKtExternalSyntheticLambda6);
                } finally {
                    inputStream.reset();
                }
            }
        });
    }

    public static int onWarmupCompleted(@NonNull List<ImageHeaderParser> list, @NonNull final ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull final Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) throws IOException {
        return onWarmupCompleted(list, new IAuthTabCallback() { // from class: o.SaversKtExternalSyntheticLambda22.8
            @Override // o.SaversKtExternalSyntheticLambda22.IAuthTabCallback
            public int onExtraCallback(ImageHeaderParser imageHeaderParser) throws Throwable {
                RecyclableBufferedInputStream recyclableBufferedInputStream;
                try {
                    recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(parcelFileDescriptorRewinder.onNavigationEvent().getFileDescriptor()), savers_androidKtExternalSyntheticLambda6);
                    try {
                        int iIAuthTabCallback = imageHeaderParser.IAuthTabCallback(recyclableBufferedInputStream, savers_androidKtExternalSyntheticLambda6);
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused) {
                        }
                        parcelFileDescriptorRewinder.onNavigationEvent();
                        return iIAuthTabCallback;
                    } catch (Throwable th) {
                        th = th;
                        if (recyclableBufferedInputStream != null) {
                            try {
                                recyclableBufferedInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        parcelFileDescriptorRewinder.onNavigationEvent();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    recyclableBufferedInputStream = null;
                }
            }
        });
    }

    private static int onWarmupCompleted(@NonNull List<ImageHeaderParser> list, IAuthTabCallback iAuthTabCallback) throws IOException {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iOnExtraCallback = iAuthTabCallback.onExtraCallback(list.get(i2));
            if (iOnExtraCallback != -1) {
                return iOnExtraCallback;
            }
        }
        return -1;
    }
}
