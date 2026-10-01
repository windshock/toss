package o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class KeyParserExternalSyntheticLambda1 {
    private final Savers_androidKtExternalSyntheticLambda6 IAuthTabCallback;
    private final List<ImageHeaderParser> onWarmupCompleted;

    public static ResourceDecoder<InputStream, Drawable> IAuthTabCallback(List<ImageHeaderParser> list, Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) {
        return new IAuthTabCallback(new KeyParserExternalSyntheticLambda1(list, savers_androidKtExternalSyntheticLambda6));
    }

    public static ResourceDecoder<ByteBuffer, Drawable> onWarmupCompleted(List<ImageHeaderParser> list, Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) {
        return new onExtraCallback(new KeyParserExternalSyntheticLambda1(list, savers_androidKtExternalSyntheticLambda6));
    }

    private KeyParserExternalSyntheticLambda1(List<ImageHeaderParser> list, Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) {
        this.onWarmupCompleted = list;
        this.IAuthTabCallback = savers_androidKtExternalSyntheticLambda6;
    }

    boolean onExtraCallback(ByteBuffer byteBuffer) throws IOException {
        return onWarmupCompleted(SaversKtExternalSyntheticLambda22.IAuthTabCallback(this.onWarmupCompleted, byteBuffer));
    }

    boolean onNavigationEvent(InputStream inputStream) throws IOException {
        return onWarmupCompleted(SaversKtExternalSyntheticLambda22.IAuthTabCallback(this.onWarmupCompleted, inputStream, this.IAuthTabCallback));
    }

    private boolean onWarmupCompleted(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP;
    }

    Resource<Drawable> pP_(@NonNull ImageDecoder.Source source, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new setLifecycleOwner(i2, i3, saversKtExternalSyntheticLambda30));
        if (!CompositionLocalKtExternalSyntheticLambda0.onWarmupCompleted(drawableDecodeDrawable)) {
            throw new IOException("Received unexpected drawable type for animated webp, failing: " + drawableDecodeDrawable);
        }
        return new onWarmupCompleted(CompositionLocalKtExternalSyntheticLambda3.pG_(drawableDecodeDrawable));
    }

    static final class onWarmupCompleted implements Resource<Drawable> {
        private final AnimatedImageDrawable IAuthTabCallback;

        onWarmupCompleted(AnimatedImageDrawable animatedImageDrawable) {
            this.IAuthTabCallback = animatedImageDrawable;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public Class<Drawable> onExtraCallbackWithResult() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        /* renamed from: pQ_, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable IAuthTabCallback() {
            return this.IAuthTabCallback;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public int onExtraCallback() {
            return ((this.IAuthTabCallback.getIntrinsicWidth() * this.IAuthTabCallback.getIntrinsicHeight()) * applyConstraintsFromLayoutParams.onWarmupCompleted(Bitmap.Config.ARGB_8888)) << 1;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public void asBinder() {
            this.IAuthTabCallback.stop();
            this.IAuthTabCallback.clearAnimationCallbacks();
        }
    }

    static final class IAuthTabCallback implements ResourceDecoder<InputStream, Drawable> {
        private final KeyParserExternalSyntheticLambda1 IAuthTabCallback;

        IAuthTabCallback(KeyParserExternalSyntheticLambda1 keyParserExternalSyntheticLambda1) {
            this.IAuthTabCallback = keyParserExternalSyntheticLambda1;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public boolean IAuthTabCallback(@NonNull InputStream inputStream, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
            return this.IAuthTabCallback.onNavigationEvent(inputStream);
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public Resource<Drawable> onNavigationEvent(@NonNull InputStream inputStream, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
            return this.IAuthTabCallback.pP_(ImageDecoder.createSource(Barrier.onExtraCallback(inputStream)), i2, i3, saversKtExternalSyntheticLambda30);
        }
    }

    static final class onExtraCallback implements ResourceDecoder<ByteBuffer, Drawable> {
        private final KeyParserExternalSyntheticLambda1 onExtraCallback;

        onExtraCallback(KeyParserExternalSyntheticLambda1 keyParserExternalSyntheticLambda1) {
            this.onExtraCallback = keyParserExternalSyntheticLambda1;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public boolean IAuthTabCallback(@NonNull ByteBuffer byteBuffer, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
            return this.onExtraCallback.onExtraCallback(byteBuffer);
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public Resource<Drawable> onNavigationEvent(@NonNull ByteBuffer byteBuffer, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
            return this.onExtraCallback.pP_(ImageDecoder.createSource(byteBuffer), i2, i3, saversKtExternalSyntheticLambda30);
        }
    }
}
