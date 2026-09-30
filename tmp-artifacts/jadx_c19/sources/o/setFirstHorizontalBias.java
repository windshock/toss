package o;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setFirstHorizontalBias implements ResourceDecoder<InputStream, TransitionExternalSyntheticLambda6> {
    private final Savers_androidKtExternalSyntheticLambda6 onExtraCallback;
    private final ResourceDecoder<ByteBuffer, TransitionExternalSyntheticLambda6> onExtraCallbackWithResult;
    private final List<ImageHeaderParser> onWarmupCompleted;

    public setFirstHorizontalBias(List<ImageHeaderParser> list, ResourceDecoder<ByteBuffer, TransitionExternalSyntheticLambda6> resourceDecoder, Savers_androidKtExternalSyntheticLambda6 savers_androidKtExternalSyntheticLambda6) {
        this.onWarmupCompleted = list;
        this.onExtraCallbackWithResult = resourceDecoder;
        this.onExtraCallback = savers_androidKtExternalSyntheticLambda6;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean IAuthTabCallback(@NonNull InputStream inputStream, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
        return !((Boolean) saversKtExternalSyntheticLambda30.IAuthTabCallback(Flow.onWarmupCompleted)).booleanValue() && SaversKtExternalSyntheticLambda22.IAuthTabCallback(this.onWarmupCompleted, inputStream, this.onExtraCallback) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public Resource<TransitionExternalSyntheticLambda6> onNavigationEvent(@NonNull InputStream inputStream, int i2, int i3, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) throws IOException {
        byte[] bArrOnNavigationEvent = onNavigationEvent(inputStream);
        if (bArrOnNavigationEvent == null) {
            return null;
        }
        return this.onExtraCallbackWithResult.onNavigationEvent(ByteBuffer.wrap(bArrOnNavigationEvent), i2, i3, saversKtExternalSyntheticLambda30);
    }

    private static byte[] onNavigationEvent(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 != -1) {
                    byteArrayOutputStream.write(bArr, 0, i2);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
