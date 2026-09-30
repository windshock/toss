package o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import o.Api33ImplExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setFuture implements ResourceDecoder<InputStream, Bitmap> {
    private final Api33ImplExternalSyntheticLambda0 onExtraCallbackWithResult;
    private final Savers_androidKtExternalSyntheticLambda6 onNavigationEvent;

    public setFuture(Api33ImplExternalSyntheticLambda0 api33ImplExternalSyntheticLambda0, Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) {
        this.onExtraCallbackWithResult = api33ImplExternalSyntheticLambda0;
        this.onNavigationEvent = savers_androidKtExternalSyntheticLambda6;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean IAuthTabCallback(@NonNull InputStream inputStream, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return this.onExtraCallbackWithResult.onExtraCallbackWithResult(inputStream);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public Resource<Bitmap> onNavigationEvent(@NonNull InputStream inputStream, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
        boolean z;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z = false;
        } else {
            z = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.onNavigationEvent);
        }
        ConstraintHelper constraintHelperOnExtraCallback = ConstraintHelper.onExtraCallback(recyclableBufferedInputStream);
        try {
            return this.onExtraCallbackWithResult.onExtraCallback(new setChildrenConstraints(constraintHelperOnExtraCallback), i2, i3, saversKtExternalSyntheticLambda30, new onExtraCallback(recyclableBufferedInputStream, constraintHelperOnExtraCallback));
        } finally {
            constraintHelperOnExtraCallback.onNavigationEvent();
            if (z) {
                recyclableBufferedInputStream.onExtraCallbackWithResult();
            }
        }
    }

    static class onExtraCallback implements Api33ImplExternalSyntheticLambda0.onExtraCallbackWithResult {
        private final RecyclableBufferedInputStream onExtraCallback;
        private final ConstraintHelper onWarmupCompleted;

        onExtraCallback(RecyclableBufferedInputStream recyclableBufferedInputStream, ConstraintHelper constraintHelper) {
            this.onExtraCallback = recyclableBufferedInputStream;
            this.onWarmupCompleted = constraintHelper;
        }

        @Override // o.Api33ImplExternalSyntheticLambda0.onExtraCallbackWithResult
        public void onNavigationEvent() {
            this.onExtraCallback.onWarmupCompleted();
        }

        @Override // o.Api33ImplExternalSyntheticLambda0.onExtraCallbackWithResult
        public void onExtraCallbackWithResult(Savers_androidKtExternalSyntheticLambda5 savers_androidKtExternalSyntheticLambda5, Bitmap bitmap) throws IOException {
            IOException iOExceptionOnExtraCallbackWithResult = this.onWarmupCompleted.onExtraCallbackWithResult();
            if (iOExceptionOnExtraCallbackWithResult != null) {
                if (bitmap != null) {
                    savers_androidKtExternalSyntheticLambda5.onWarmupCompleted(bitmap);
                    throw iOExceptionOnExtraCallbackWithResult;
                }
                throw iOExceptionOnExtraCallbackWithResult;
            }
        }
    }
}
