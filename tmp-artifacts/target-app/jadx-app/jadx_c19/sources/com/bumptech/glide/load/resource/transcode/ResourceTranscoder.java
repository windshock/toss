package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;
import o.SaversKtExternalSyntheticLambda30;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface ResourceTranscoder<Z, R> {
    Resource<R> onWarmupCompleted(@NonNull Resource<Z> resource, @NonNull SaversKtExternalSyntheticLambda30 saversKtExternalSyntheticLambda30);
}
