package o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ViewFactoryHolder implements ResourceDecoder<ByteBuffer, Bitmap> {
    private final Api33ImplExternalSyntheticLambda0 onWarmupCompleted;

    public ViewFactoryHolder(Api33ImplExternalSyntheticLambda0 api33ImplExternalSyntheticLambda0) {
        this.onWarmupCompleted = api33ImplExternalSyntheticLambda0;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public boolean IAuthTabCallback(@NonNull ByteBuffer byteBuffer, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return this.onWarmupCompleted.IAuthTabCallback(byteBuffer);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public Resource<Bitmap> onNavigationEvent(@NonNull ByteBuffer byteBuffer, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
        return this.onWarmupCompleted.onWarmupCompleted(byteBuffer, i2, i3, saversKtExternalSyntheticLambda30);
    }
}
