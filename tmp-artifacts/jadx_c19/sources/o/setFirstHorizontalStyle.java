package o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import java.io.ByteArrayOutputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setFirstHorizontalStyle implements ResourceTranscoder<Bitmap, byte[]> {
    private final Bitmap.CompressFormat onExtraCallback;
    private final int onNavigationEvent;

    public setFirstHorizontalStyle() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public setFirstHorizontalStyle(@NonNull Bitmap.CompressFormat compressFormat, int i2) {
        this.onExtraCallback = compressFormat;
        this.onNavigationEvent = i2;
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public Resource<byte[]> onWarmupCompleted(@NonNull Resource<Bitmap> resource, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        resource.IAuthTabCallback().compress(this.onExtraCallback, this.onNavigationEvent, byteArrayOutputStream);
        resource.asBinder();
        return new ResolvableFuture(byteArrayOutputStream.toByteArray());
    }
}
