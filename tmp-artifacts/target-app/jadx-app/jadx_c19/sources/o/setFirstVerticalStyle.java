package o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setFirstVerticalStyle implements ResourceTranscoder<Drawable, byte[]> {
    private final ResourceTranscoder<TransitionExternalSyntheticLambda6, byte[]> IAuthTabCallback;
    private final ResourceTranscoder<Bitmap, byte[]> onExtraCallbackWithResult;
    private final Savers_androidKtExternalSyntheticLambda5 onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    private static Resource<TransitionExternalSyntheticLambda6> onExtraCallback(@NonNull Resource<Drawable> resource) {
        return resource;
    }

    public setFirstVerticalStyle(@NonNull Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, @NonNull ResourceTranscoder<Bitmap, byte[]> resourceTranscoder, @NonNull ResourceTranscoder<TransitionExternalSyntheticLambda6, byte[]> resourceTranscoder2) {
        this.onWarmupCompleted = savers_androidKtExternalSyntheticLambda5;
        this.onExtraCallbackWithResult = resourceTranscoder;
        this.IAuthTabCallback = resourceTranscoder2;
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public Resource<byte[]> onWarmupCompleted(@NonNull Resource<Drawable> resource, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        Drawable drawableIAuthTabCallback = resource.IAuthTabCallback();
        if (drawableIAuthTabCallback instanceof BitmapDrawable) {
            return this.onExtraCallbackWithResult.onWarmupCompleted(setUpdateBlock.onWarmupCompleted(((BitmapDrawable) drawableIAuthTabCallback).getBitmap(), this.onWarmupCompleted), saversKtExternalSyntheticLambda30);
        }
        if (drawableIAuthTabCallback instanceof TransitionExternalSyntheticLambda6) {
            return this.IAuthTabCallback.onWarmupCompleted(onExtraCallback(resource), saversKtExternalSyntheticLambda30);
        }
        return null;
    }
}
