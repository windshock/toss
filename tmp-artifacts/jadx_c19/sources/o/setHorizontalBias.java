package o;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setHorizontalBias implements ResourceTranscoder<TransitionExternalSyntheticLambda6, byte[]> {
    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public Resource<byte[]> onWarmupCompleted(@NonNull Resource<TransitionExternalSyntheticLambda6> resource, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return new ResolvableFuture(Barrier.onExtraCallback(resource.IAuthTabCallback().onNavigationEvent()));
    }
}
