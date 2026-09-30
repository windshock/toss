package o;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getDoneValue implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType onWarmupCompleted(@NonNull InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType onWarmupCompleted(@NonNull ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int IAuthTabCallback(@NonNull InputStream inputStream, @NonNull Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) throws IOException {
        int iOnWarmupCompleted = new FlowColumnOverflowScopeImplExternalSyntheticLambda0(inputStream).onWarmupCompleted("Orientation", 1);
        if (iOnWarmupCompleted == 0) {
            return -1;
        }
        return iOnWarmupCompleted;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int onWarmupCompleted(@NonNull ByteBuffer byteBuffer, @NonNull Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) throws IOException {
        return IAuthTabCallback(Barrier.onNavigationEvent(byteBuffer), savers_androidKtExternalSyntheticLambda6);
    }
}
