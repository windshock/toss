package com.bumptech.glide.request;

import androidx.annotation.Nullable;
import o.SaversKtExternalSyntheticLambda21;
import o.SaversKtExternalSyntheticLambda7;
import o.setTransitionDuration;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface RequestListener<R> {
    boolean onLoadFailed(@Nullable SaversKtExternalSyntheticLambda7 saversKtExternalSyntheticLambda7, Object obj, setTransitionDuration<R> settransitionduration, boolean z);

    boolean onResourceReady(R r, Object obj, setTransitionDuration<R> settransitionduration, SaversKtExternalSyntheticLambda21 saversKtExternalSyntheticLambda21, boolean z);
}
