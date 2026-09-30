package o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getFutureValue implements ResourceDecoder<InputStream, Bitmap> {
    private final AndroidViewHolderExternalSyntheticLambda0 IAuthTabCallback = new AndroidViewHolderExternalSyntheticLambda0();

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public boolean IAuthTabCallback(@NonNull InputStream inputStream, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public Resource<Bitmap> onNavigationEvent(@NonNull InputStream inputStream, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
        return this.IAuthTabCallback.pK_(ImageDecoder.createSource(Barrier.onExtraCallback(inputStream)), i2, i3, saversKtExternalSyntheticLambda30);
    }
}
