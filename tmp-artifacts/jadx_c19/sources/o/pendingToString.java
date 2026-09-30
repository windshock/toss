package o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class pendingToString implements ResourceDecoder<Bitmap, Bitmap> {
    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public boolean IAuthTabCallback(@NonNull Bitmap bitmap, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public Resource<Bitmap> onNavigationEvent(@NonNull Bitmap bitmap, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return new onExtraCallbackWithResult(bitmap);
    }

    static final class onExtraCallbackWithResult implements Resource<Bitmap> {
        private final Bitmap onWarmupCompleted;

        @Override // com.bumptech.glide.load.engine.Resource
        public void asBinder() {
        }

        onExtraCallbackWithResult(@NonNull Bitmap bitmap) {
            this.onWarmupCompleted = bitmap;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public Class<Bitmap> onExtraCallbackWithResult() {
            return Bitmap.class;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public Bitmap IAuthTabCallback() {
            return this.onWarmupCompleted;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public int onExtraCallback() {
            return applyConstraintsFromLayoutParams.onWarmupCompleted(this.onWarmupCompleted);
        }
    }
}
