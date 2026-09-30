package o;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setHorizontalGap<Z> implements ResourceTranscoder<Z, Z> {
    private static final setHorizontalGap<?> onNavigationEvent = new setHorizontalGap<>();

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public Resource<Z> onWarmupCompleted(@NonNull Resource<Z> resource, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30) {
        return resource;
    }

    public static <Z> ResourceTranscoder<Z, Z> onExtraCallbackWithResult() {
        return onNavigationEvent;
    }
}
