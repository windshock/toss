package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
interface afterDone {
    ImageHeaderParser.ImageType onExtraCallback() throws IOException;

    int onExtraCallbackWithResult() throws IOException;

    Bitmap onExtraCallbackWithResult(BitmapFactory.Options options) throws IOException;

    void onNavigationEvent();

    public static final class IAuthTabCallback implements afterDone {
        private final List<ImageHeaderParser> IAuthTabCallback;
        private final ByteBuffer onExtraCallback;
        private final Savers_androidKtExternalSyntheticLambda6 onExtraCallbackWithResult;

        @Override // o.afterDone
        public void onNavigationEvent() {
        }

        IAuthTabCallback(ByteBuffer byteBuffer, List<ImageHeaderParser> list, Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) {
            this.onExtraCallback = byteBuffer;
            this.IAuthTabCallback = list;
            this.onExtraCallbackWithResult = savers_androidKtExternalSyntheticLambda6;
        }

        @Override // o.afterDone
        public Bitmap onExtraCallbackWithResult(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(onWarmupCompleted(), null, options);
        }

        @Override // o.afterDone
        public ImageHeaderParser.ImageType onExtraCallback() throws IOException {
            return SaversKtExternalSyntheticLambda22.IAuthTabCallback(this.IAuthTabCallback, Barrier.onWarmupCompleted(this.onExtraCallback));
        }

        @Override // o.afterDone
        public int onExtraCallbackWithResult() throws IOException {
            return SaversKtExternalSyntheticLambda22.IAuthTabCallback(this.IAuthTabCallback, Barrier.onWarmupCompleted(this.onExtraCallback), this.onExtraCallbackWithResult);
        }

        private InputStream onWarmupCompleted() {
            return Barrier.onNavigationEvent(Barrier.onWarmupCompleted(this.onExtraCallback));
        }
    }

    public static final class onExtraCallback implements afterDone {
        private final List<ImageHeaderParser> onExtraCallback;
        private final SaversKtExternalSyntheticLambda4 onExtraCallbackWithResult;
        private final Savers_androidKtExternalSyntheticLambda6 onWarmupCompleted;

        onExtraCallback(InputStream inputStream, List<ImageHeaderParser> list, Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) {
            this.onWarmupCompleted = (Savers_androidKtExternalSyntheticLambda6) markHierarchyDirty.onExtraCallbackWithResult(savers_androidKtExternalSyntheticLambda6);
            this.onExtraCallback = (List) markHierarchyDirty.onExtraCallbackWithResult(list);
            this.onExtraCallbackWithResult = new SaversKtExternalSyntheticLambda4(inputStream, savers_androidKtExternalSyntheticLambda6);
        }

        @Override // o.afterDone
        public Bitmap onExtraCallbackWithResult(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.onExtraCallbackWithResult.onNavigationEvent(), null, options);
        }

        @Override // o.afterDone
        public ImageHeaderParser.ImageType onExtraCallback() throws IOException {
            return SaversKtExternalSyntheticLambda22.IAuthTabCallback(this.onExtraCallback, this.onExtraCallbackWithResult.onNavigationEvent(), this.onWarmupCompleted);
        }

        @Override // o.afterDone
        public int onExtraCallbackWithResult() throws IOException {
            return SaversKtExternalSyntheticLambda22.onNavigationEvent(this.onExtraCallback, this.onExtraCallbackWithResult.onNavigationEvent(), this.onWarmupCompleted);
        }

        @Override // o.afterDone
        public void onNavigationEvent() {
            this.onExtraCallbackWithResult.onExtraCallbackWithResult();
        }
    }

    public static final class onNavigationEvent implements afterDone {
        private final List<ImageHeaderParser> IAuthTabCallback;
        private final Savers_androidKtExternalSyntheticLambda6 onExtraCallback;
        private final ParcelFileDescriptorRewinder onExtraCallbackWithResult;

        @Override // o.afterDone
        public void onNavigationEvent() {
        }

        onNavigationEvent(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) {
            this.onExtraCallback = (Savers_androidKtExternalSyntheticLambda6) markHierarchyDirty.onExtraCallbackWithResult(savers_androidKtExternalSyntheticLambda6);
            this.IAuthTabCallback = (List) markHierarchyDirty.onExtraCallbackWithResult(list);
            this.onExtraCallbackWithResult = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // o.afterDone
        public Bitmap onExtraCallbackWithResult(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.onExtraCallbackWithResult.onNavigationEvent().getFileDescriptor(), null, options);
        }

        @Override // o.afterDone
        public ImageHeaderParser.ImageType onExtraCallback() throws IOException {
            return SaversKtExternalSyntheticLambda22.onExtraCallback(this.IAuthTabCallback, this.onExtraCallbackWithResult, this.onExtraCallback);
        }

        @Override // o.afterDone
        public int onExtraCallbackWithResult() throws IOException {
            return SaversKtExternalSyntheticLambda22.onWarmupCompleted(this.IAuthTabCallback, this.onExtraCallbackWithResult, this.onExtraCallback);
        }
    }
}
