package o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setReleaseBlock implements ResourceDecoder<ByteBuffer, Bitmap> {
    private final AndroidViewHolderExternalSyntheticLambda0 onWarmupCompleted = new AndroidViewHolderExternalSyntheticLambda0();

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public boolean IAuthTabCallback(@NonNull ByteBuffer byteBuffer, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public Resource<Bitmap> onNavigationEvent(@NonNull ByteBuffer byteBuffer, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
        return this.onWarmupCompleted.pK_(ImageDecoder.createSource(byteBuffer), i2, i3, saversKtExternalSyntheticLambda30);
    }
}
